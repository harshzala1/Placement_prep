package lab6;
import java.util.Scanner;

public class AutoMorphic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[]=new int[32];

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int square = n*n;

        int digit=0,rev=0,rev2=0;

        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            digit +=1;
            n/=10;
        }

        for(int i=0; i<digit; i++){
            int rem2 = square %10;
            rev2 = (rev2*10)+rem2;
            square/=10;
        }

        if(rev==rev2){
            System.out.print("Number is Automorphic ");
        }
        else{
            System.out.print("Number is Not Automorphic ");
        }
    }
}

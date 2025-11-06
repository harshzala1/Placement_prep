package lab6;



import java.util.Scanner;

public class DeciamlToOctal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[]=new int[32];

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int i=0;

        while(n>0){
            arr[i++] = n%8;
            n/=8;
        }

        for(int j=arr.length-1; j>=0; j--){
            System.out.print(arr[j]+",");
        }
    }
}

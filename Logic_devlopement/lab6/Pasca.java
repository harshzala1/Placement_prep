package lab6;
import java.util.Scanner;


public class Pasca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
            }
            for(int k = i-1; k >= 1; k--){
                if(k%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
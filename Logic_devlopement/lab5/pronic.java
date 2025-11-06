package lab6;

import java.util.Scanner;

public class pronic {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int check;
        int flag = 0;
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        for(int i = 0; i<=n;i++){
            check=(i*(i+1));
            if(check==n){
                flag = 1;
            }
        }
        if(flag==1){
            System.out.println("number is pronic");
        }else{
            System.out.println("number is not pronic");
        }
    }
}

package lab6;

import java.util.Scanner;

public class Karpekar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int ans = n*n;

        int a = ans%100;
        int b = ans/100;

        int sum = a+b;

    
        
        if(n==sum){
            System.out.println("Karpekar");
        }
        else{
            System.out.println("Not Karpekar"); 
        }
      

    }
}


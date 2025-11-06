package lab6;

import java.util.Scanner;

public class angle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hr");
        int hr = sc.nextInt();
     System.out.println("Enter a min");
        int min = sc.nextInt();
        double angle = (30*hr)-(5.5*min);
        if(angle<0){
            angle = angle*(-1);
        }
        System.out.println(angle);
    }
}

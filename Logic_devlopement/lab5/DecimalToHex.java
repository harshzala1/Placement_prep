package lab6;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7',
                            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        String hex = ""; 

        while (n > 0) {
            int rem = n % 16;
            hex = hexDigits[rem] + hex; 
            n = n / 16;
        }

        System.out.println("Hexadecimal: " + hex);
    }
}


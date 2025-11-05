import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter size of first array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

      
        System.out.print("Enter size of second array: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        System.out.println("\nIntersection:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break; 
                }
            }
        }

        input.close();
    }
}

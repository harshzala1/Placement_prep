


import java.util.Arrays;
import java.util.Scanner;

public class removesduplicatee {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
         System.out.println("enter element at "+idx+"in array ");
           arr[idx] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
      
        int[] uniqueArr = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }

      
        return Arrays.copyOf(temp, j);
    }
}

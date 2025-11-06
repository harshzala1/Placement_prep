import java.util.Arrays;
import java.util.Scanner;

public class unionarray{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter size of first array ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int idx = 0; idx < a.length; idx++) {
         System.out.println("enter element at first arrat at "+idx+"in array ");
           a[idx] = sc.nextInt();
        }
         System.out.println("enter size of 2nd array");
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int idx = 0; idx < b.length; idx++) {
         System.out.println("enter element at  second array at "+idx+"in array ");
           b[idx] = sc.nextInt();
        }

        int [] ans = new int[m+n];
        int idx=0;
        for (int i = 0; i < a.length; i++) {
            ans[idx++] = a[i];
            
        }

        for (int i = 0; i < b.length; i++) {
            ans[idx++] = b[i];
        }

         int[] uniqueArr = removeDuplicates(ans);

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
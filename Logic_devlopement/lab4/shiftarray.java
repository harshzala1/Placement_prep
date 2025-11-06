import java.util.Scanner;

public class shiftarray {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }
        int last = arr1[arr1.length-1];
        for(int i = arr1.length-1 ; i>0;i--){
           arr1[i]=arr1[i-1];

        }
        arr1[0] = last;
System.out.println("ans array");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}

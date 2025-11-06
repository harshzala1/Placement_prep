import java.util.Scanner;

public class deleteatspec {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("before array");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i]+" ");
        }
      System.out.println("Enter index  :");
     int idx = input.nextInt();
      int[] ans = new int[n1-1];
      for(int i =0 ; i<n1;i++){
       if(i < idx){
        ans[i] = arr1[i];
        continue;
       } 
       if(i>= idx){
        ans[i-1]=arr1[i];
       }

      }
      System.out.println("ans array");
        for (int i = 0; i < n1-1; i++) {
            System.out.print(ans[i]+" ");
        }
 
    }
}

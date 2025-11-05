import java.util.Scanner;

public class secondlarge {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
         System.out.println("enter element at "+idx+"in array ");
           arr[idx] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
            if(arr[i]>arr[j]){
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
         System.out.println(arr[n-2]);
    }
}

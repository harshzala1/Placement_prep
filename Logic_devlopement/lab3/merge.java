
import java.util.Scanner;

public class merge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,m;

        n = sc.nextInt();
        m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];

        int ans[] = new int[m+n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int idx=0;
        for (int i = 0; i < a.length; i++) {
            ans[idx++] = a[i];
            
        }

        for (int i = 0; i < b.length; i++) {
            ans[idx++] = b[i];
        }

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]);
        }
        
    }
}


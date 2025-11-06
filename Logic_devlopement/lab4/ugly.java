import java.util.*;

public class ugly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int flag=1;
    for(int i = 2 ; i<n;i++){
        if(n%i==0){
            if(i!=2||i!=3||i!=5){
                System.out.println(i+" "+flag);
                flag=0;
                break;
            }
        }
    }
    if(flag==0){
        System.out.println("not ugly");
    }else{
        System.out.println("its AN UGLY");
    }
    }
}

package lab6;

public class pascal {
    public static void main(String[] args) {
        int temp;
        for(int i =0 ; i<5;i++){
            temp=1;
            for(int j = 1 ; j <=(2*i-1) ;j++ ){
                
                if(j%2==0){
                    System.out.print("*");
                    temp++;
                }else{
                   if(temp> ((j/2))){
                    System.out.print(temp--);
                   }else{
                         System.out.print(temp);	
				            if(temp>1 && j<=(2*i-1)/2){
					                temp--;
				            }else{
					            temp++;
				            }
                   } 
                }
                
            }
            System.out.println();
        }
    }
}

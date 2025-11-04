#include<stdio.h>
void main(){
	int i,j,k,temp;
	for(i=1;i<=5;i++){
			temp=i;
		for(k=5;k>=i;k--){
			printf(" ");
		}
			for(j=1;j<=2*i-1;j++){
			
            	printf("%d",temp);	

				if(temp>1 && j<=(2*i-1)/2){
					temp--;
				}else{
					temp++;
				}
		}

		printf("\n");
	
	}
}

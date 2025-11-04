#include<stdio.h>
void main(){
	int x,y,i,ans=1;
	scanf("%d",&x);
   	scanf("%d",&y);
	for(i=1;i<=y;i++){
	
		ans = ans*x;
	}
	printf("%d",ans);
	
}


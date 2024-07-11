#include<stdio.h>
int main(){
    int a = 1 ;
    for(int  i= 1;i<=5;i++){
        for(int j=1;j<=i;j++){
            if(j==5){
                break;
            }
            else{
                printf("%d ",a);
            a++;
            }
        }
        printf("\n");
    }
    return 0;
}
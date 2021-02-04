#include "stdio.h"
#include <stdio.h>
#include <conio.h>
int i=0;

int hanoi(int n,int inicio, int fin, int aux){
	if(n==1){
            i=i+1;
            printf("\n %d  %c->%c \n",i,  inicio, fin); 
            return(0);
	}else{ 
            hanoi(n-1,inicio,aux,fin);
            i=i+1;
            printf("\n %d  %c->%c \n",i, inicio, fin); 
            hanoi(n-1,aux,fin, inicio);  return(0); 
	}
}
int main(void){
int hanoi(int n,int inicio, int fin, int aux);
	char inicio='I';
	char aux   ='A';
	char fin   ='F';
	int n; 
	printf("\nNumero de discos: ");
	scanf("%d",&n);
	fflush(stdin);
        printf("\n\nLos movimientos a realizar son: \n");
	hanoi(n,inicio,fin, aux);
        getch();
}



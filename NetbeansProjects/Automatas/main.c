#include <stdio.h>
#include <conio.h>
# include <windows.h>
void main(){
  char c,resultado[10];
  int estado=1,i=0,error=99,digito=1,punto=2, e=3,mas_menos=4,fdc=5, j;
  int entrada, fin=64;
  	int tabla[8][6]={{0,0,0,0,0,0},
			 {0,2,99,99,99,99},
			 {0,2,3,5,99,99},
			 {0,4,99,99,99,99},
			 {0,4,99,5,99,100},
			 {0,7,99,99,6,99},
			 {0,7,99,99,99,99},
			 {0,7,99,99,99,100}};
        error=0;
/*
	clrscr();
        clrscr();
*/
        system("cls"); 
        system("cls"); 
do{ i=i+1;
  printf("\ndame un caracter ");
  c=getchar();
  fflush (stdin);
  resultado[i]=c;
    if ((c>= 48)&&(c<=57)) entrada=digito;
	else if ((c== 46)) entrada=punto;
	else if ((c==69) || (c==101)) entrada=e;
	else if ((c==43) || (c==45)) entrada=mas_menos;
   else if (c==fin) entrada=fdc;
   else error=1;
   if (error!=1) estado=tabla[estado][entrada];
}
while((error == 0) && (estado <=7));
printf("\n Los caracteres ingresados fueron ");
for(j=1;j<=i;j=j+1) printf("%c",resultado[j]);
if (error==1) printf("\n el caracter no permitido fue %c", c);
else if(estado ==99) printf("\n hubo problemas en la combinacion de letras y digitos el ultimo carater fue %c", c);
else if(estado ==100) printf("\n no hubo problemas");
    getch();
}



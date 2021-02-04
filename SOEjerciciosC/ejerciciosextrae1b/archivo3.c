#include<stdio.h>
#include<stdlib.h>
#include<string.h>
//Programa que abre un archivo que se ingrese desde consola
int main(){
FILE *fp;
char nombrearchivo[20];
int c;
printf("Introduce el nombre del archivo sin su extension:\n Ejemplo: archivo1.txt escriba archivo1\n");
gets(nombrearchivo);
strcat(nombrearchivo,".txt");
printf("Resultado:\n");
fp=fopen(nombrearchivo,"r");

if(fp==NULL){
printf("Error al abrir archivo\n");
exit(1);
}else {
while ((c=fgetc(fp)) != EOF){
printf("%c",c);
}
}
printf("\n---FIN DEL ARCHIVO---\n");
fclose(fp);
return 0;
}

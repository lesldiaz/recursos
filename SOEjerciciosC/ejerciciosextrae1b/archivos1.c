#include<stdio.h>
#include<stdlib.h>
//Programa que abre un archivo y comprueba si esta vacio o no
int main(){
FILE *fp;
int c;
printf("Nombre del Archivo: archivo1.txt \n");
printf("Resultado:\n");
fp=fopen("archivo22.txt","r");

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

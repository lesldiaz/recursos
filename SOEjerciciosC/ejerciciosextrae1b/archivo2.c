#include<stdio.h>
#include<stdlib.h>
int main(){
FILE *fp1,*fp2,*fp3;
char c1[500];
int e,idNum;
fp1=fopen("archivo21.txt","r");
fscanf(fp1,"%s",c1);
if(fp1==NULL){
printf("Error al abrir archivo\n");
exit(1);
} 
fp2=fopen("archivo22.txt","w");
fprintf(fp2,"%s", c1);
if(fp2==NULL){
printf("Error al abrir archivo\n");
exit(1);
}

fclose(fp2);
printf("Nuevo contenido de archivo.22\n");
fp3=fopen("archivo22.txt","r");
while ((e=fgetc(fp3))!= EOF){
printf("%c",e);
}
printf("\n---FIN DEL ARCHIVO---\n");
fclose(fp1);
fclose(fp3);
return 0;
}

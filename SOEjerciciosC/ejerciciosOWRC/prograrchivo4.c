//Copiar el contenido de un archivo en otro
//Llamada a librerías
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
 //Función principal
int main(){
//Declaramos variables
int fd,fd2;
char c;
//ABRIR ARCHIVO U ORIGEN
fd = open("archivo12.txt",O_RDONLY);
//CREAR ARCHIVO DE DESTINO
fd2 = open("destino.txt",O_WRONLY|O_CREAT,S_IRUSR|S_IWUSR);
 
//CONTROLAR SI EXISTE ARCHIVO
if(fd!=-1){
//LEER EL ARCHIVO
//El archivo se lee caracter por caracter
while(read(fd,&c,sizeof(c)!=0)){
//GUARDAR ARCHIVO NUEVO
write(fd2,&c,sizeof(c));
}
//CERRAR ARCHIVO
close(fd);
close(fd2);
fd2 = open("destino.txt",O_RDONLY);
//LEER EL ARCHIVO DESTINO PARA COMPROBAR SI TODO SALIO BIEN
//El archivo se lee caracter por caracter
while(read(fd2,&c,sizeof(c)!=0)){
printf("%c",c);
}
close(fd2);
}else{
printf("\nEl archivo no existe");
}
}

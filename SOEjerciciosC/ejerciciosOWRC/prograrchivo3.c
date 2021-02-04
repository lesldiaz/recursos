//Crear un Archivo
//Llamada a librerías
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include<string.h> 
int main(){
int fd,longi;
char c[500];
//O_WRONLY abre el archivo salida.txt en modo escritura
//O_CREAT crea el archivo si todavía no existe
//S_IRUSR|S_IWUSR son los modos que seleccione: Lectura y Escritura para el usuario
fd = open("archivo14.txt",O_WRONLY|O_CREAT,S_IRUSR|S_IWUSR);
//fd = open("salida1.txt",O_WRONLY|00700);
 
printf("Ingresa lo que quiere guardar en el archivo:");
gets(c);
longi=strlen(c);
printf("el tamaño del string es %d\n",longi);
 
//Guardamos en el archivo lo que ingresamos por teclado
write(fd,&c,longi);
 
//CERRAR ARCHIVO
close(fd);
return 0;
}

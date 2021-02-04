//Segundo programa: lectura

//Este programa lee diez caracteres, a partir de la posición 40, de un fichero ya existente.
#define _GNU_SOURCE
#include <fcntl.h>      /* Modos de apertura */
#include <stdlib.h>     /* Funciones de ficheros */
#include<string.h>
#include<stdio.h>
main ( int argc, char* argv[] )
{
   char cadena[11];	/* Depósito de los caracteres */
   int leidos;

   /* Apertura del fichero */

   int fichero = open ("mifichero", O_RDONLY);

   /* Comprobación */   
   if (fichero==-1)
   {
        perror("Error al abrir fichero:");
        exit(1);
   }

   /* Coloca el puntero en la posición 40 */
   lseek(fichero,40,SEEK_SET);

   /* Lee diez bytes */
   leidos = read(fichero, cadena, 10);
   close(fichero);
   cadena[10]=0;

   /* Mensaje para ver qué se leyó */
   printf("Se leyeron %d bytes. La cadena leída es %s\n",leidos,cadena);

   return 0;
}

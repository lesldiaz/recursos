#include <stdio.h>
#include <string.h>
 /*
Programa que vaya leyendo las frases que el usuario teclea y las guarde en un fichero 
de texto llamado “registroDeUsuario.txt”. Terminará cuando la frase introducida sea "fin" (esa frase 
no deberá guardarse en el fichero). 
*/
int main()
{
   FILE* ptFichero;
   char fin[]="fin";  
   char frase[60];
 
   ptFichero = fopen("archivo5.txt", "wt");
   printf("Escriba algo, sirve como un editor(mas o menos).\nCuando quiera salir," 
          "escriba la palabra fin.\n");
   
      puts("\nEscriba una FRASE:\n(o fin). \n");
do
   {
      gets(frase);
      if (strcmp(frase, fin) == 0)
         break;
      fprintf(ptFichero, "%s\n", frase);
   }
   while (strcmp(frase, fin) != 0);
 
   fclose(ptFichero);
   return 0;
}
 

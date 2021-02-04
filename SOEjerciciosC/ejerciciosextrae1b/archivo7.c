/* agenda que maneje los siguientes datos: nombre, dirección, tlf móvil, email, y día, 
mes y año de nacimiento (estos tres últimos datos deberán ser números enteros cortos). Deberá 
tener capacidad para 100 fichas. Se deberá poder añadir un dato nuevo, visualizar los nombres 
de las fichas existentes, o mostrar todos los datos de una persona (se preguntará al usuario 
cual es el nombre de esa persona que quiere visualizar). Al empezar el programa, leerá los datos 
de un fichero llamado “agenda.dat” (si existe). Al terminar, guardará todos los datos en ese 
fichero. 
*/
#include <stdio.h> 
#include <string.h> 
#include<stdlib.h>
int main()       
{           
  struct agenda 
  {       
     char nombre [21]; 
     char direccion [31]; 
     char celular[13]; 
     char email[31]; 
     unsigned short int diaNac, mesNac, anyoNac; 
  }persona[100]; 

  FILE* fichero;       
  char textoTemporal[21]; 
  int opcion, personas=-1;           
  int i;               
                    
  fichero = fopen("archivo7.txt", "rt");   
  if (fichero != NULL) 
  { 
     while (! feof(fichero)) 
     {                           
        fscanf(fichero, "%s", persona[i].nombre);     
        if (feof(fichero)) break;     
        printf("%s\n", persona[i].nombre); 
            
        fscanf(fichero, "%s", persona[i].direccion);     
        if (feof(fichero)) break; 
        printf("%s\n", persona[i].direccion); 
            
        fscanf(fichero, "%s", persona[i].celular);     
        if (feof(fichero)) break; 
        printf("%s\n", persona[i].celular); 
            
        fscanf(fichero, "%s", persona[i].email);     
        if (feof(fichero)) break; 
        printf("%s\n", persona[i].email); 
            
        fscanf(fichero, "%hd%hd%hd", &persona[i].diaNac, &persona[i].mesNac, &persona[i].anyoNac);     
        if (feof(fichero)) break; 
        printf("%hd %hd %hd\n\n", persona[i].diaNac, persona[i].mesNac, persona[i].anyoNac); 
        personas++; 

     } 
     fclose(fichero);                 
  } 
  printf("Leidos %d datos", personas+1); 
            
  do     
  { 
     puts("\n\n  MENU:\n"); 
     puts("1.- Agregar un nuevo dato."); 
     puts("2.- Ver todos los datos existentes."); 
     puts("3.- Ver todos los datos de una persona."); 
     puts("0.- Terminar."); 
     puts("   Elija una opcion: "); 
        
     scanf("%d", &opcion); 
     getchar();                           

     switch (opcion) 
     { 
        case 1:    /* Agregar un nuevo dato */ 
           printf ("Introduce nombre: "); 
           gets (persona[personas+1].nombre); 
           fprintf(fichero, "%s", persona[personas+1].nombre); 
           printf ("Introduce direccion: "); 
           gets (persona[personas+1].direccion); 
           fprintf(fichero, "%s", persona[personas+1].direccion); 
           printf ("Introduce celular: "); 
           gets (persona[personas+1].celular); 
           fprintf(fichero, "%s", persona[personas+1].celular); 
           printf ("Introduce correo electronico: "); 
           gets (persona[personas+1].email); 
           fprintf(fichero, "%s", persona[personas+1].email); 
           printf ("Introduce dia de nacimiento: "); 
           scanf("%hd", &persona[personas+1].diaNac); 
           fprintf(fichero, "%hd", persona[personas+1].diaNac); 
           printf ("Introduce mes de nacimiento: "); 
           scanf ("%hd", &persona[personas+1].mesNac); 
           fprintf(fichero, "%hd", persona[personas+1].mesNac); 
           printf ("Introduce año de nacimiento: "); 
           scanf ("%hd", &persona[personas+1].anyoNac); 
           fprintf(fichero, "%hd", persona[personas+1].anyoNac); 
           personas ++; 
           break; 

        case 2:    /* Ver todos los nombres */ 
           puts ("Ver todos los nombres existentes:"); 
           for (i=0; i<=personas; i++) 
              puts (persona[i].nombre); 
           break; 
                
        case 3:    /* Ver todos los datos de una persona */ 
           printf ("Nombre a buscar? "); 
           for (i=0; i<=personas; i++) 
           { 
              gets(textoTemporal); 
              if (strcmp (textoTemporal, persona[i].nombre) != 0) break; 
              { 
                 puts (persona[i].nombre); 
                 puts (persona[i].direccion); 
                 puts (persona[i].celular); 
                 puts (persona[i].email); 
                 printf("%hd %hd %hd.\n", persona[i].diaNac, 
                    persona[i].mesNac, persona[i].anyoNac); 
              } 
                              
           } 
           break; 
        } 
      } 
      while (opcion != 0); 
      
      fichero = fopen("archivo7.txt", "wt");   
      for (i=0; i<=personas; i++) 
      { 
         fprintf (fichero, "%s\n", persona[i].nombre); 
         fprintf (fichero, "%s\n", persona[i].direccion); 
         fprintf (fichero, "%s\n", persona[i].celular); 
         fprintf (fichero, "%s\n", persona[i].email); 
         fprintf (fichero, "%hd %hd %hd\n", 
            persona[i].diaNac, persona[i].mesNac, persona[i].anyoNac); 
      } 
      fclose(fichero); 
      return 0; 
                            
} 

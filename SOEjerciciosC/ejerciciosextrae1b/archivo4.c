#include <stdio.h>
#include <stdlib.h>
#include <string.h>
main(){
	char nombre[20];
	char apellido[20];
	char telefono[15];
	FILE *fichero;

	if ((fichero = fopen( "archivo4.txt", "wt" )) == NULL) {
		printf( "No se puede abrir el fichero.\n" );
		exit( 1 );
	}

		printf( "Nombre: " ); gets(nombre);
		strcat(nombre,"\n");
		if (strcmp(nombre,"")) {
			printf( "Apellido: " );	gets(apellido);
strcat(apellido,"\n");
			printf( "Teléfono: " );	gets(telefono);
strcat(telefono,"\n");

			/* Guarda el registro en el fichero */
 		fputs(nombre, fichero);
		fputs(apellido, fichero);
		fputs(telefono, fichero);
		}
	

	fclose( fichero );
}

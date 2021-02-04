/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   SumaDificil.c
 * Author: Leslie Diaz 
 *
 * Created on 14 de enero de 2017, 18:10
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAMANO 1000     //Cantidad de caracteres en la entrada de datos
// A tener en cuenta el carácter nulo, con lo que sólo
                                        // admitirá 999 caracteres.
                                        // Modificable a voluntad

/*
 * 
 */
int main(void) {
     char cadena[TAMANO];
    char* posicion;
    long long int suma;
 
    // Introducimos la línea
    fgets (cadena, TAMANO, stdin);
 
    while (strlen(cadena) > 1)
    {
 
        suma = 0;
 
        // la función strtok() corta la cadena hasta la primera coincidencia
        // de alguno de los caracteres entrecomillados y devuelve la subcadena
        // obtenida, modificando a su vez la cadena original.
        posicion = strtok (cadena, " \t");
        while (posicion != NULL){
                // atoll() devuelve el valor numérico de la cadena como long long.
                suma +=  atoll(posicion);
                posicion = strtok (NULL, " \t");
        }
 
        printf ("%lld\n", suma);
        // Con MingGW para Windows sería: printf ("%l64d\n", suma);
 
        // Introducimos la línea nuevamente
        fgets (cadena, TAMANO, stdin);
    }   
    return 0;
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   newmain.c
 * Author: Leslie Diaz 
 *
 * Created on 17 de noviembre de 2016, 20:39
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main() {
    int a,i,j;
    printf("Introduzca un numero:\n");
    scanf("%d",&a);
    int matriz [a][a];
    for(i=0;i<a;i++){
        int b= a-1;
        printf("\n");
        for(j=0;j<a;j++){
            
            if (i==0 || i==b){  
                matriz [i][j]= 42;
                printf("%c",matriz[i][j]);
           
            } else 
                if (j==0 || j==b){  
                matriz [i][j]= 42;
                printf("%c",matriz[i][j]);
            } else {
                matriz [i][j]= ' ';
                printf("%c",matriz[i][j]);
            }
            
        }
    }

    
    
    system("PAUSE");
    return (0);
}


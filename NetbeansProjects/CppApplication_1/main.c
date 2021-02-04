/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: PAVILLION
 *
 * Created on 25 de mayo de 2016, 12:27
 */

#include <stdio.h>
#include <stdlib.h>
#include<string.h>

int main (){ 
    int i=0;
    int j=0;
    for (i=0;i<25;i++){
        for (j=0;j<10;j++){
            if (i==0){
                printf("%2d",j);
            }else{
                if (j==0){
                    printf("%2d",i);
                }else {
                    printf ("  ");
                }
            }
        }
    }
    
    system("PAUSE");
    
}

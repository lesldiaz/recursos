#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

int main()
{
    char frase[1024],*token,fraseinv[1204],resp[1024],respd[1024];
    const char espacio[2]=" ";
    int i,j;
    memset(frase, 0, 1204);
    memset(fraseinv, 0, 1204);
    memset(resp, 0, 1204);
    memset(respd, 0, 1204);
    printf("Ingrese una frase:\n");
    fflush(stdin);
    gets(frase);
    for(i=strlen(frase)-1,j=0;i>-1;i--,j++)
        fraseinv[j]=frase[i];
    token=strtok(fraseinv,espacio);
    while(token!= NULL)
    {
        for(i=strlen(token)-1,j=0;i>-1;i--,j++)
        resp[j]=token[i];
        strcat(respd,resp);
        strcat(respd," ");
        for(i=strlen(token)-1,j=0;i>-1;i--,j++)
        resp[j]=0;
        token=strtok(NULL,espacio);
    }
    printf("%s",respd);
    system("pause");
    return 0;
}


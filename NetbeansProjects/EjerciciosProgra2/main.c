/*
#include <stdio.h>
#include <stdlib.h>
#define LMAX 8
int cmpfun(const void *a,const void *b );
int main() {
    int k,j,i,c1[LMAX],c2[LMAX],t,n,r=0;
    printf("Ingrese el numero de casos de prueba... ");
    scanf("%d",&t);
    for(i=0;i<t;i++)
    {
        printf("Ingrese las dimensiones de los vectores... ");
        scanf("%d",&n);
        for(j=0;j<n;j++)
        {
            printf("Elemento [%d]... ",j);
            scanf("%d",&c1[j]);
        }
        qsort(c1,n,sizeof(int),cmpfun);
        for(j=0;j<n;j++)
        {
            printf("Elemento [%d]... ",j);
            scanf("%d",&c2[j]);
        }
        qsort(c2,n,sizeof(int),cmpfun);
        for(j=0,k=n-1;j<n;j++,k--)
        {
            r+=c1[j]*c2[k];
        }
            
        printf("Resultado %d = %d/n",i,r);
        r=0;
    }
    return (EXIT_SUCCESS);
}

int cmpfun(const void *a,const void *b )
{
    return (*(int *)a-*(int *)b);
}
*/


#include <stdlib.h>
#include <stdio.h>


int **crearMatriz(int m, int n) {
    int **matriz;
    int i;
    matriz = (int **) malloc(m * sizeof (int *));
    if (matriz == NULL)
        return NULL;
    for (i = 0; i < m; i++) {
        matriz[i] = (int *) malloc(n * sizeof (int));
        if (matriz[i] == NULL)
            return NULL;
    }
    return matriz;
}

void leerMatriz(int **M, int m, int n) {
    int i, j;
    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
            /*printf("Ingrese valor[%d][%d]: ",i,j);
            scanf("%d",&M[i][j]);*/
            M[i][j] = rand();
        }
        putchar('\n');
    }
}

void imprimirMatriz(int **M, int m, int n) {
    int i, j;
    for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
            printf("%5d\t", M[i][j]);
        }
        putchar('\n');
    }
}

int main() {
    int m, n;
    int **matriz;
    printf("\nIngrese tamano de filas y columnas:");
    scanf("%d%d", &m, &n);
    matriz = crearMatriz(m, n);
    leerMatriz(matriz, m, n);
    imprimirMatriz(matriz, m, n);
    
    system("pause");
    return 0;
    
    
}



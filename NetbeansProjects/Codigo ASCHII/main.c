#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define ancho 11
#define alto 27
int main() {
    int i = 0;
    int x, y;
    char c;
    c = 0;
    for (i = 0; i < alto * ancho; i++) {
        x = i % ancho;
        y = i / ancho;
        if (y == 0) {
            if (x == 0) {
                printf("    | x|");
            } else {
                printf("    %2d|", x - 1);
            }
        } else {
            if (x == 0) {
                printf("    |%2d|", y - 1);
            } else {
                printf("      %c", c++);
            }
        }
        if (x == ancho - 1) {
            printf("\n");
        }
    }
    system("pause");
    return (0);
}
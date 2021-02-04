#include <stdio.h>
#include <stdlib.h>
//trabaja con 32 bits para el octal
int main() {
    
    int a = 017;
    int b = 0xAB;
    int c = 0x10;
    int d = 10;
    
    a=b-a;
    b=b+7;
    d=-d;
    
    printf("\n a,b son %o %d %x %o %d", b,c,a,d,d);
    
}

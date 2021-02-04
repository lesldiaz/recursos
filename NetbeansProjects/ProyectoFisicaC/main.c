#include <stdio.h>
#include <stdlib.h>
#include<math.h>


int main(){
    float m,l,u,d,o,b,c,e,h,a,i,j,k,p,n,r,t,s,v;
    float g =9.81;
    printf(" Una cadena cuya masa es m y su longitud es l, se la sostiene en la posicion mostrada(ver figura), donde b es la\n longuitud BC, y o es el angulo, el coeficiente de rozamiento en las partes superior y lateral de la pista es u.\n Si la cadena se abandona desde el reposo, Determine la rapidez que esta adquiere, al pasar el extremo A por el B.\n Nota:condiderando g=9.81\n");
    printf("     _________\n ___|_________ \\\n    A        B\\ \\ \n               \\ \\\n                \\/ C\n _______________o\\ \n\n");

    printf(" Introduzca el valor de la masa m: ");
    scanf("%f",&m);
    printf(" Introduzca el valor de la longuitud l: ");
    scanf("%f",&l);
    printf(" Introduzca el valor del coeficiente de rozamiento u: ");
    scanf("%f",&u);
    printf(" Introduzca el valor del angulo o: ");
    scanf("%f",&o);
    printf(" Introduzca el valor de la longuitud BC: ");
    scanf("%f",&b);
    printf("\n x representa la longuitud que la cadena se a transladado\n");
    printf(" Densidad(d) = Masa(m)/Longitud(l)\n");
    d=m/l;
    printf(" d = %4.2f",d);
    printf("\n Masa(m) = Densidad(d)*Longuitudad(l)");
    printf("\n\n Desde el punto A hasta B\n");
    printf("  Longuitud de AB = (l-b-x)\n");
    a=u*d*g*(l-b);
    r=u*d*g;
    printf("  Sumatoria de fuerzas en el eje y = 0\n  N = mg\n  Fr = uN = umg = udg(l-b-x) = %4.2f - %4.2f x\n",a,r);
    c=(l-b)*d;
    printf("  Sumatoria de fuerzas en el eje x = ma\n  T - Fr = ma\n  T = d(l-b-x)a + Fr\n  T = %4.2f a - %4.2f xa + %4.2f - %4.2f x\n",c,d,a,r);
    printf("\n Desde el punto B hasta C\n");
    printf("  Longuitud de BC = (b+x)\n");
    h=u*d*g*b*sin(o*3.1416/180);
    i=u*d*g*sin(o*3.1416/180);
    printf("  Sumatoria de fuerzas en el eje y = 0\n  N = mg sen(o)\n  Fr = uN = umg sen(o) = udg(b+x)sen(o) = %4.2f + %4.2f x\n",h,i);
    j=d*b*cos(o*3.1416/180)*g;
    k=d*cos(o*3.1416/180)*g;
    p=d*b;
    printf("  Sumatoria de fuerzas en el eje x = ma\n  mg cos(o) - T - Fr = ma\n  d(b+x)g cos(o) - T - Fr = d(b+x)a\n  %4.2f + %4.2f x - %4.2f a + %4.2f xa - %4.2f + %4.2f x - %4.2f  - %4.2f x = %4.2f a + %4.2f xa",j,k,c,d,a,r,h,i,p,d);
    printf("\n  %4.2f + %4.2f x - %4.2f + %4.2f x - %4.2f - %4.2f x=(%4.2f + %4.2f x + %4.2f - %4.2f x)a",j,k,a,r,h,i,p,d,c,d);
    r = k+r-i;
    t = j-a-h;
    s = p+c;
    printf("\n  %4.2f + %4.2f x =( %4.2f)a",t,r,s);
    t = t/s;
    r = r/s;
    printf("\n  %4.2f + %4.2f x = a",t,r);
    printf("\n  a=vdv/dx");
    n=l-b;
    printf("\n  intregral[0,%4.2f](%4.2f + %4.2f x)dx = integral[0,v](vdv)",n,t,r);
    r=r/2;
    printf("\n  [%4.2f x + %4.2f x^2][0,%4.2f] = [v^2/2][0,v]",t,r,n);
    r=t*n+n*n*r;
    printf("\n  %4.2f = v^2/2 ",r);
    r=sqrt(r*2);
    printf("\n  v = %4.2f",r);
    system("PAUSE");
    return 0;
}

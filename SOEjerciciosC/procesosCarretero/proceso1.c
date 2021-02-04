#include <sys/types.h>
#include <stdio.h>
int main ()
{
struct timeval t0;
pid_t pid;
int i;
int suma=0;
int n = 10;
for (i = 0; i < n; i++){
pid = fork ();
if(pid==0){
return 0;
}else if(pid!=0){
gettimeofday(&t0,NULL);
unsigned int ut0=t0.tv_sec*10000000+t0.tv_usec;
suma=suma+ut0;
printf("Tiempo en microsegundos: \n %f\n",(ut0)/100.0);
}
}

printf("Suma de los tiempos :\n%d \n",suma);
}

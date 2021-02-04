#include <pthread.h>
#include <stdio.h>
#include <time.h>
void *func (void  *temp){
int a=pthread_self();
printf("Thread %d\n",a);
pthread_exit(0);
}

int main(){
clock_t start = clock();
pthread_t hilo;
int i;
for (i=0;i<=1000;i++){
pthread_create(&hilo,NULL,&func,NULL);
}
printf("Tiempo de Ejecucion: %f\n",((double)clock()-start)/CLOCKS_PER_SEC);
return 0;
}

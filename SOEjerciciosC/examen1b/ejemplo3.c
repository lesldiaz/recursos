//programa que crea un proceso ligero independiente por cada número que se da por teclado hasta introducir 0
#include <pthread.h>
#include <stdio.h>


void *imprimir(int *n)
{
  printf("Thread %d %d \n", (int)pthread_self(),*n);
  pthread_exit(NULL);
}

int main(void)
{
  pthread_attr_t attr;
  pthread_t thid;
  int num=1;
  
  pthread_attr_init(&attr);
  pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
  
  while(num)
	{
	  printf("Escribir numero entero :\n");
	  scanf("%d", &num); /* espera */
	  pthread_create(&thid,&attr,imprimir,&num);
	}
  pthread_attr_destroy(&attr);
  return 0;
}


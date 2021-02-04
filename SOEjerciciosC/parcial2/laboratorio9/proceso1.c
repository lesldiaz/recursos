#include <unistd.h>
#include <stdio.h>
#include <time.h>

void main(int argc, char *argv[]){
	clock_t start=clock();
	pid_t pid;
	int i;
	printf("\n");
	for(i=0;i<=1000;i++){
		pid=fork();
		if(pid==0) break;
	}
	printf("El padre del proceso %d es: %d\n", getpid(), getppid());
	if(pid>0) printf("Tiempo de ejecucion: %f\n",((double)clock()-start)/CLOCKS_PER_SEC);
}


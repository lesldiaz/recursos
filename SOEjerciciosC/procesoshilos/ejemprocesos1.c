#include<sys/types.h>
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
int main(int argc, char * argv[]) {
	int pid1, pid2, estado;
	int h1_finalizado = 0, h2_finalizado = 0;
	pid1=fork();
	if (pid1 == 0){
		int i;
		for(i=0; i<7; i++) {
			printf("Hola\n");
			sleep(1);
		}
		puts("Soy Hijo #1 finalizando.\n");
		exit (0);
	}
	pid2=fork();
	if (pid2 == 0){
		int i;
		for(i=0; i<8; i++) {
			printf("Adios\n");
			sleep(2);
		}

	}	
		puts("Soy Hijo #2 finalizando.\n");
		exit (0);
	
	if ((pid1 < 0) || (pid2 < 0)) {
		printf("Algo salió muy mal...\n");
		exit (1);
	}
	if ((pid1 > 0) && (pid2 > 0)) {
		printf("Soy el proceso padre de PID:%u y PID:%u\n", pid1, pid2);
		while((!h1_finalizado) || (!h2_finalizado)) {
			int pid;
			pid = wait(&estado);
			if (pid == pid1) h1_finalizado = 1;
			if (pid == pid2) h2_finalizado = 1;
			
		
		/* Terminaron los dos hijos */
		puts("Ambos hijos terminaron.");
		}

	}
}

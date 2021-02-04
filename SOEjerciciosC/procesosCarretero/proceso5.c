#include<fcntl.h>
#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>
int main()
{
pid_t pid;
int status;
pid=fork();
switch(pid){
case -1: 
//Gestión del error
exit(1);
break;
case 0: 
//Proceso hijo
printf("Proceso hijo. PID = %d \n", pid);
break;
default: 
/* Proceso padre */
printf("Proceso padre. PID = %d \n", pid);
wait(&status);
 /* espera al final del proceso hijo */
break;
} /* fin del switch */
printf("Fin de la ejecución \n");
return 0;
} /* fin de la función main */

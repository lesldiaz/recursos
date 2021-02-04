#include<errno.h>
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<wait.h>
#include<sys/types.h>

int main(void) {
int i;
int status;
pid_t pid;
printf("Padre con ID %i\n", (int)getpid());
for (i=0; i < 3; i++)
{
if (fork() ==0) {

printf("Hijo %i con padre %i\n",(i+1),(int)getppid() );
exit(0);

}
}
printf("Padre espera a hijos.\n");
pid = wait(&status);
while ( (pid != -1) || ( (pid==-1) && (errno == EINTR) ) ) {
printf("Hijo %i terminado.\n", (int)pid);
pid = wait(&status);
}
printf("Todos los hijos terminados.\n");
return 0;
}

//Code for fork() creation test
#include <stdio.h>
#include <unistd.h>
#include<pthread.h>
#include<stdlib.h>
#include <sys/wait.h>
#include<sys/types.h>
#define NFORKS 10

void do_nothing(){
int i;
i=0;
}
int main(){
int j,*status;
pid_t pid;

for (j=0; j<NFORKS;j++){
pid=fork();
if (pid <0){
printf("fork failed with error code = %d \n",pid);
exit (0);
} else if (pid == 0){
do_nothing();
exit (0);
} else{
printf("%d\n",waitpid(pid,status,0));
}
}
return 0;
}

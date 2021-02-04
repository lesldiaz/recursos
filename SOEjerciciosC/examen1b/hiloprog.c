//Code for pthread_create() test  
#include<sys/types.h>
#include<sys/wait.h>
#include<unistd.h>
#include<stdlib.h>
#include<pthread.h>
#include<stdio.h>
#define NTHREAD 10
void *do_nothing(void *null){
int i=0;
pthread_exit(NULL);
}
main(){
int rc,i,j,detachstate;
pthread_t tid;
pthread_attr_t attr;
pthread_attr_init(&attr);
pthread_attr_setdetachstate(&attr,PTHREAD_CREATE_JOINABLE);
for (j=0;j<NTHREAD;j++){
rc = pthread_create(&tid,&attr,do_nothing,NULL);
if(rc){
printf("ERROR; return code from pthread_create() is %d\n",rc);
exit(-1);
}
rc = pthread_join(tid,NULL);
if(rc){
printf("ERROR; return code from pthread_join() is %d\n",rc);
exit(-1);
}
}
pthread_attr_destroy(&attr);
pthread_exit(NULL);
}

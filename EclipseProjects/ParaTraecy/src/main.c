#include<stdio.h>
#include<stdlib.h>

void main(){
	int phds = 5;
	int idiomas = 6;
	int exp = 1;
	int puntaje = 0;

	if (phds > 1){
		puntaje+=4;
	} else {
		puntaje+=2;
	}
	if (idiomas > 1){
		puntaje+=3;
	}
	if (exp >=10){
		puntaje+=5;
	}else {
		puntaje+=2;
	}

	if (puntaje > 9){
		printf("Aprobaste wee, pasas a la ronda de entrevistas");
	} else {
		printf("Adaptarse, sobrevivir y vencer. Game Over :( .. \n Su puntaje fue %d",puntaje);
	}
	system("pause");
}

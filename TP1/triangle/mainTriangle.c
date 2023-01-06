/*
Zakari IKHOU 
Akim SAADI
Mohamed TAKHCHI
Reda CHANAA
Sohaib EL MOUHTADI 
12/01/2020
*/

#include <stdlib.h>
#include <stdio.h>
#include "triangle.h"


void printTriangle(Triangle triangle){
printf("Cote A : %lf\n", triangle.coteA);
printf("Cote B : %lf\n", triangle.coteB);
printf("Cote C : %lf\n", triangle.coteC);
}

int main (){
	Triangle triangle;
	triangle = readData("triangle.txt");
	printTriangle(triangle);
	printf("%d\n",typeTriangle(triangle.coteA,triangle.coteB,triangle.coteC));
	return 0;
}

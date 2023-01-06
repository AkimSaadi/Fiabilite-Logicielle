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

Triangle readData (char * file){
	FILE *f;
	f=fopen(file,"r");
	if (f == NULL)
	{
		
		Triangle triangle;
		triangle.coteA = -1;
		triangle.coteB = -1;
		triangle.coteC = -1;
		return triangle;
	} 
	int i;
	i=0;
	Triangle triangle;
	char ligne[50] = "";;
	while (fgets(ligne, 50, f) != NULL){
		switch(i)
	   {
		   case 0 : triangle.coteA = atoi(ligne); break;
		   case 1 : triangle.coteB = atoi(ligne); break;
		   case 2 : triangle.coteC = atoi(ligne); break;
		   default : ;
	   }
	   i++;
   }
   fclose(f);
   	if (i!=3)
	{
		Triangle triangle;
		triangle.coteA = -1;
		triangle.coteB = -1;
		triangle.coteC = -1;
		return triangle;
	} 
   return triangle;
}

int typeTriangle(float a, float b, float c){
	if (a > b+c || b > a+c || c > b+a || a <= 0 || b <= 0 || c <= 0)
		return -1;
	else if (a==b && a==c && b==c)
		return 3;
	else if (a==b || a==c || c==b)
		return 2;
	else return 1;
}

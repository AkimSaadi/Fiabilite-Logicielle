#ifndef TRIANGLE
#define TRIANGLE

#include <stdlib.h>
#include <stdio.h>

typedef struct  {
  float coteA;
  float coteB;
  float coteC;
} Triangle;

Triangle readData (char * file);
//void readData (char * file, float cotes[]);

int typeTriangle(float a, float b, float c);
#endif

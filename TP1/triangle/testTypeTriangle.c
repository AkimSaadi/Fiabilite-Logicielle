/*
Zakari IKHOU 
Akim SAADI
Mohamed TAKHCHI
Reda CHANAA
Sohaib EL MOUHTADI 
12/01/2020
*/



#include "triangle.h"
#include <stdio.h>
#include <CUnit/CUnit.h>
#include <CUnit/Basic.h>

/*Test suites and clean up functions*/
int init_suite(void) { return 0;}
int clean_suite(void){return 0;}

/* les tests*/
void testTriangleEquilateral(void) {
  float a = 4; 
  float b = 4;
  float c = 4;
  CU_ASSERT_EQUAL(typeTriangle(a, b, c), 3);
}

void testTriangleIsocele(void) {
  float a = 6; 
  float b = 4;
  float c = 6;
  CU_ASSERT_EQUAL(typeTriangle(a, b, c), 2);
}

void testTriangleScalene(void) {
  float a = 5; 
  float b = 4;
  float c = 6;
  CU_ASSERT_EQUAL(typeTriangle(a, b, c), 1);
}

void testNonTriangle(void) {
  float a = 5; 
  float b = 4;
  float c = 10;
  CU_ASSERT_EQUAL(typeTriangle(a, b, c), -1);
}

void testTrianglePoint(void) {
  float a = 0; 
  float b = 0;
  float c = 0;
  CU_ASSERT_EQUAL(typeTriangle(a, b, c), -1);
}

void testTriangleNegatifDistance(void) {
  float a = -2; 
  float b = 4;
  float c = 4;
  CU_ASSERT_EQUAL(typeTriangle(a, b, c), -1);
}

/* Mise en place des tests via main */
int main(void){
  CU_pSuite pSuite = NULL;
  /*initialise le catalogue de tests*/
  printf("initialize test registry\n");
  if (CUE_SUCCESS != CU_initialize_registry()) {
    return CU_get_error();
  }
  printf("add suite to testregistry\n");
  /*ajoute une suite de tests au catalogue */
  /*la suite de test n'a qu'un seul test ici!!!*/
  pSuite = CU_add_suite("essaiTestSuite", init_suite, clean_suite);
  if (pSuite == NULL){
    CU_cleanup_registry();
    return CU_get_error();
  }

  /*ajouter les  tests à la suite */
  printf("add first test\n");
  if ((CU_add_test(pSuite,"testTriangleEquilateral", testTriangleEquilateral) == NULL) 
      ||(CU_add_test(pSuite,"testTriangleIsocele", testTriangleIsocele) == NULL)
      ||(CU_add_test(pSuite,"testTriangleScalene", testTriangleScalene) == NULL)
      ||(CU_add_test(pSuite,"testNonTriangle", testNonTriangle) == NULL) 
      ||(CU_add_test(pSuite,"testTrianglePoint", testTrianglePoint) == NULL) 
      ||(CU_add_test(pSuite,"testTriangleNegatifDistance", testTriangleNegatifDistance) == NULL) 
      /* si plus de tests: || (CU_add_test(...)) || ...|| (CU_add_test(...))*/
      ){
    CU_cleanup_registry();
    return CU_get_error();
  }


  /*Run all tests using the basic interface */
  printf("start execution\n");
  CU_basic_set_mode(CU_BRM_VERBOSE);
  CU_basic_run_tests();
  printf("termine\n\n");
  CU_basic_show_failures(CU_get_failure_list());

  /*Clean up registry and return*/
  CU_cleanup_registry();
  return CU_get_error();
}

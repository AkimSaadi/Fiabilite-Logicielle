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

void testReadNumbers(void) {
  FILE*f;
  f=fopen("readtest.txt", "w");
  fprintf(f,"4 \n5 \n6 ");
  fclose(f);

  CU_ASSERT_EQUAL(readData("readtest.txt").coteA, 4);
  CU_ASSERT_EQUAL(readData("readtest.txt").coteB, 5);
  CU_ASSERT_EQUAL(readData("readtest.txt").coteC, 6);
}

void testReadLessNumbers(void) {
  FILE*f;
  f=fopen("readtest.txt", "w");
  fprintf(f,"4\n5");
  fclose(f);

  CU_ASSERT_EQUAL(readData("readtest.txt").coteA, -1);
  CU_ASSERT_EQUAL(readData("readtest.txt").coteB, -1);
  CU_ASSERT_EQUAL(readData("readtest.txt").coteC, -1);
}

void testReadMoreNumbers(void) {
  FILE*f;
  f=fopen("readtest.txt", "w");
  fprintf(f,"4\n5\n6\n7");
  fclose(f);
  
  CU_ASSERT_EQUAL(readData("readtest.txt").coteA, -1);
  CU_ASSERT_EQUAL(readData("readtest.txt").coteB, -1);
  CU_ASSERT_EQUAL(readData("readtest.txt").coteC, -1);
}


void testReadEmpty(void) {
  FILE*f;
  f=fopen("readtest.txt", "w");
  fprintf(f," ");
  fclose(f);
  
  CU_ASSERT_EQUAL(readData("readtest.txt").coteA, -1);
  CU_ASSERT_EQUAL(readData("readtest.txt").coteB, -1);
  CU_ASSERT_EQUAL(readData("readtest.txt").coteC, -1);
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
  if ((CU_add_test(pSuite,"testReadNumbers", testReadNumbers) == NULL) 
  	||(CU_add_test(pSuite,"testReadLessNumbers", testReadLessNumbers) == NULL)
  	||(CU_add_test(pSuite,"testReadMoreNumbers", testReadMoreNumbers) == NULL)
  	||(CU_add_test(pSuite,"testReadEmpty", testReadEmpty) == NULL)

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

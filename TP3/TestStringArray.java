package teststringarray;

/*initial class test for stringArray */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import stringarray.StringArray;

class TestStringArray {
	private static String[] slist1={
			"a","b","ccc","ccd","d","e","f","g"
		};
		private static String[] slist2={
			"ab","ccd","ccc","g","f","e","d"
		};

		private StringArray array1;
		private StringArray array2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 System.out.println("debut des tests");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		 System.out.println("fin des tests");
	}

	@BeforeEach
	void setUp() throws Exception {
		 System.out.println("debut du test");
	}

	@AfterEach
	void tearDown() throws Exception {
		 System.out.println("fin du test");
	}
	
	@Test
	public void testStringArray1() {
		array1=new StringArray(slist1);
		array2=new StringArray(slist2);		
		assertEquals(7,array2.size());	
		assertEquals(8,array1.size());		
	}
	
	@Test
	public void test1IndexOf() {
		array2=new StringArray(slist2);
		assertEquals(-1,array2.IndexOf("ee"));
	}
	
	@Test
	public void test2IndexOf() {
		array2=new StringArray(slist2);
		assertEquals(3,array2.IndexOf("d"));
	}
	
}

package test;
import org.junit.jupiter.api.*;
import triangle.Triangle;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTypeTriangle {

    Triangle triangle;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Debut des tests");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("Fin des tests");
    }

    @BeforeEach
    void setUp() throws Exception {
        triangle = new Triangle();
    }

    @AfterEach
    void tearDown() throws Exception {
        
    }


    @Test
    public final void testTriangleEquilateral() {
        float a = 4;
        float b = 4;
        float c = 4;
        triangle.setCoteA(a);
        triangle.setCoteB(b);
        triangle.setCoteC(c);
        int expected = 3;
        int actual = triangle.typeTriangle();
        assertEquals(expected,actual);

    }

    @Test
    public final void testTriangleIsocele() {
        float a = 6;
        float b = 4;
        float c = 6;
        triangle.setCoteA(a);
        triangle.setCoteB(b);
        triangle.setCoteC(c);
        int expected = 2;
        int actual = triangle.typeTriangle();
        assertEquals(expected,actual);
    }

    @Test
    public final void testTriangleScalene() {
        float a = 5;
        float b = 4;
        float c = 6;
        triangle.setCoteA(a);
        triangle.setCoteB(b);
        triangle.setCoteC(c);
        int expected = 1;
        int actual = triangle.typeTriangle();
        assertEquals(expected,actual);
    }

    @Test
    public final void testNonTriangle() {
        float a = 5;
        float b = 4;
        float c = 10;
        triangle.setCoteA(a);
        triangle.setCoteB(b);
        triangle.setCoteC(c);
        int expected = -1;
        int actual = triangle.typeTriangle();
        assertEquals(expected,actual);
    }

    @Test
    public final void testTrianglePoint() {
        float a = 0;
        float b = 0;
        float c = 0;
        triangle.setCoteA(a);
        triangle.setCoteB(b);
        triangle.setCoteC(c);
        int expected = -1;
        int actual = triangle.typeTriangle();
        assertEquals(expected,actual);
    }

    @Test
    public final void testTriangleNegatifDistance() {
        float a = -2;
        float b = 4;
        float c = 4;
        triangle.setCoteA(a);
        triangle.setCoteB(b);
        triangle.setCoteC(c);
        int expected = -1;
        int actual = triangle.typeTriangle();
        assertEquals(expected,actual);
    }

}

package testtemperature;

import org.junit.jupiter.api.*;
import temperature.ATester;
import temperature.MockConversion;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @authors Reda CHANAA, Mohamed TAKHCHI, Zakari IKHOU, Sohaib ELMOUHTADI, Akim SAADI
 *
 */

public class AtesterTestManualMock {
    private ATester aTester;


    @BeforeAll
    static void setUpBeforeClass()  {
        System.out.println("Beginning of tests");
    }

    @BeforeEach
    void setUP (){
        MockConversion c = new MockConversion();
        aTester = new ATester(c);
    }

    @AfterEach
    void tearDown (){
        aTester = null;
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("End of tests");
    }

    @Test
    void convertitF2C() {
        Double expected = 0.0;
        Double actual = aTester.convertit(32.0,"F2C");
        assertEquals(expected,actual);
        expected = 100.0;
        actual = aTester.convertit(212.0,"F2C");
        assertEquals(expected,actual);
    }

    @Test
    void convertitC2F() {
        Double expected = 98.6;
        Double actual = aTester.convertit(37.0,"C2F");
        assertEquals(expected,actual);
        expected = -40.0;
        actual = aTester.convertit(-40.0,"C2F");
        assertEquals(expected,actual);
    }
}

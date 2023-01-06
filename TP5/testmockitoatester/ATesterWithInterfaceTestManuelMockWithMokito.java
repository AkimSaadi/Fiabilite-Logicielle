package testtemprature;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;
import  org.mockito.MockitoAnnotations;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import temperature.ATester;
import temperature.Conversion;


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
    void setUP throws Exception (){
        Conversion c = mock(Conversion.class);
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
        when(c.getTemperature(32.0,"F2C")).thenReturn(0.0);
        aTester = new ATester(c);
        Double expected = 0.0;
        Double actual = aTester.convertit(32.0,"F2C");
        assertEquals(expected,actual);
        when(c.getTemperature(212.0,"F2C")).thenReturn(100.0);
        aTester = new ATester(c);
        expected = 100.0;
        actual = aTester.convertit(212.0,"F2C");
        assertEquals(expected,actual);
    }

    @Test
    void convertitC2F() {
        when(c.getTemperature(37.0,"C2F")).thenReturn(98.6);
        aTester = new ATester(c);
        Double expected = 98.6;
        Double actual = aTester.convertit(37.0,"F2C");
        assertEquals(expected,actual);
        when(c.getTemperature(-40.0,"C2F")).thenReturn(-40.0);
        aTester = new ATester(c);
        expected = -40.0;
        actual = aTester.convertit(-40.0,"F2C");
        assertEquals(expected,actual);
    }
}

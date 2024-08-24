package com.dasbd72;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testIsPrime() {
        assertTrue(App.isPrime(2));
        assertTrue(App.isPrime(71));
        assertTrue(App.isPrime(97));
    }
}

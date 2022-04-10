package io.michaelcane;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyCalculatorTest {
    Calculator calculator;

    @Before public void setUp() {
        calculator = new Calculator();
    }

    double delta = 1e-15;
    @Test
    public void test$cube() {
        /**
         * This method should take a value (double)
         * and return the cubed value.
         */
        double expectedValue = 8;
        double actualValue = calculator.sum(2, 3);
        assertEquals("This should evaluate to 8", expectedValue, actualValue, delta);
    }


}
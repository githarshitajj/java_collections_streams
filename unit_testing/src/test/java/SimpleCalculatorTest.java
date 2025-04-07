import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldEqualsFour() {
        var calculator = new SimpleCalculator(); //Java 10 onwards java supports what's
        //called local variable type inference -- the compiler infers what type of reference variable is being created
        assertEquals(4, calculator.add(2, 2));
        //assertNotEquals(4, calculator.add(2, 2));
        //assertTrue(calculator.add(2, 2) == 4); if the expression returns the true the test passes
        //assertFalse
        //assertNull if the expression returns null
        //assertEquals(0, calculator.subtract(2, 2));

        //this only registers as a single test
    }
    @Test
    void testSubstraction() {
        var calculator = new SimpleCalculator();
        assertEquals(0, calculator.subtract(2, 2));
    }
    @Test
    void testMultiply() {
        var calculator = new SimpleCalculator();
        assertEquals(18, calculator.multiply(9, 2));
    }

}
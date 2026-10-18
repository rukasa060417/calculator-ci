package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("add(5, 3) returns 8")
    void testAddPositive() {
        assertEquals(8.0, calc.add(5.0, 3.0));
    }

    @Test
    @DisplayName("add(-3, 3) returns 0")
    void testAddNegativeAndZero() {
        assertEquals(0.0, calc.add(-3.0, 3.0));
    }

    @Test
    @DisplayName("subtract(10, 4) returns 6")
    void testSubtractPositive() {
        assertEquals(6.0, calc.subtract(10.0, 4.0));
    }

    @Test
    @DisplayName("subtract(4, 10) returns -6")
    void testSubtractNegativeResult() {
        assertEquals(-6.0, calc.subtract(4.0, 10.0));
    }

    @Test
    @DisplayName("multiply(6, 7) returns 42")
    void testMultiplyPositive() {
        assertEquals(42.0, calc.multiply(6.0, 7.0));
    }

    @Test
    @DisplayName("multiply(-4, 5) returns -20")
    void testMultiplyNegativeFactor() {
        assertEquals(-20.0, calc.multiply(-4.0, 5.0));
    }

    @Test
    @DisplayName("multiply(3, 2.5) returns 7.5")
    void testMultiplyFractionalFactor() {
        assertEquals(7.5, calc.multiply(3.0, 2.5));
    }

    @Test
    @DisplayName("divide(10, 4) returns 2.5")
    void testDivide() {
        assertEquals(2.5, calc.divide(10.0, 4.0));
    }

    @Test
    @DisplayName("add(1e15, 1e15) returns 2e15")
    void testAddLargeBoundary() {
        assertEquals(2e15, calc.add(1e15, 1e15));
    }

    @Test
    @DisplayName("subtract(0.1, 0.2) is close to -0.1")
    void testSubtractFloatPrecision() {
        assertEquals(-0.1, calc.subtract(0.1, 0.2), 1e-9);
    }

    @Test
    @DisplayName("divide(5, 0) throws ArithmeticException")
    void testDivideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5.0, 0.0));
    }
}

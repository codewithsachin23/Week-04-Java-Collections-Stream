package day04.exceptionstesting;



import org.day04.problemstatement.exceptions.exceptionpropagation.ThrowVsThrows;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ThrowVsThrowsTest {

    @Test
    void testValidInterestCalculation() {
        double amount = 10000;
        double rate = 5;
        int years = 2;

        double expectedInterest = (amount * rate * years) / 100;
        assertEquals(expectedInterest, ThrowVsThrows.calculateInterest(amount, rate, years), 0.001);
    }

    @Test
    void testNegativeAmountThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ThrowVsThrows.calculateInterest(-10000, 5, 2);
        });
        assertEquals("Amount and rate must be positive.", exception.getMessage());
    }

    @Test
    void testNegativeRateThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ThrowVsThrows.calculateInterest(10000, -5, 2);
        });
        assertEquals("Amount and rate must be positive.", exception.getMessage());
    }

    @Test
    void testZeroAmountThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ThrowVsThrows.calculateInterest(0, 5, 2);
        });
        assertEquals("Amount and rate must be positive.", exception.getMessage());
    }

    @Test
    void testZeroRateThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ThrowVsThrows.calculateInterest(10000, 0, 2);
        });
        assertEquals("Amount and rate must be positive.", exception.getMessage());
    }
}

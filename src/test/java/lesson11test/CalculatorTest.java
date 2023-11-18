package lesson11test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    public static final int FIRST = 4;
    public static final int SECOND = 4;
    public static final int SUM = FIRST + SECOND;
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addCorrectlyIfArgumentsCorrect() {
        // GIVEN

        // WHEN
        int actualResult = calculator.add(FIRST, SECOND);

        // THEN
        Assertions.assertEquals(SUM, actualResult);
    }
}
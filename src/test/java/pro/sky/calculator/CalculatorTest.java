package pro.sky.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.ZeroDivisionException;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private CalculatorService calculatorServiceIml;

    @BeforeEach
    public void init() {
        calculatorServiceIml = new CalculatorServiceIml();
    }

    @AfterEach
    public void after() {
        calculatorServiceIml = null;
    }

    @Test
    public void sumTest() throws Exception {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int result = calculatorServiceIml.calculatorSum(a, b);
        int result1 = calculatorServiceIml.calculatorSum(c, d);
        assertEquals(5, result);
        assertEquals(9, result1);

    }

    @Test
    public void minusTest() throws Exception {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int result = calculatorServiceIml.calculatorMinus(a, b);
        int result1 = calculatorServiceIml.calculatorMinus(c, d);
        assertEquals(-1, result);
        assertEquals(-1, result1);
    }

    @Test
    public void multiplicationTest() throws Exception {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int result = calculatorServiceIml.calculatorMultiplication(a, b);
        int result1 = calculatorServiceIml.calculatorMultiplication(c, d);
        assertEquals(6, result);
        assertEquals(20, result1);
    }

    @Test
    public void divisionTest() throws Exception {
        BigDecimal a = new BigDecimal(4);
        BigDecimal b = new BigDecimal(2);
        BigDecimal c = new BigDecimal(10);
        BigDecimal d = new BigDecimal(2);
        BigDecimal result = calculatorServiceIml.calculatorDivision(a, b);
        BigDecimal result1 = calculatorServiceIml.calculatorDivision(c, d);
        assertEquals(new BigDecimal(2), result);
        assertEquals(new BigDecimal(5), result1);
    }

    @Test
    public void divisionByZeroTest() throws Exception {
        BigDecimal a = new BigDecimal(4);
        BigDecimal b = new BigDecimal(0);
        Exception exception = assertThrows(ZeroDivisionException.class, () -> {
            calculatorServiceIml.calculatorDivision(a, b);
        });
        String expectedMessage = "На ноль делить нельзя";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}

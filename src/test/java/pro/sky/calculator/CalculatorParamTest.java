package pro.sky.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorParamTest {
    private CalculatorService calculatorServiceIml;

    @BeforeEach
    public void init() {
        calculatorServiceIml = new CalculatorServiceIml();
    }

    @AfterEach
    public void after() {
        calculatorServiceIml = null;
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 5", "4,5,9"})
    public void sumTest(int a, int b, int result) throws Exception {
        assertEquals(result, calculatorServiceIml.calculatorSum(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, -1", "4,5,-1"})
    public void minusTest(int a, int b, int result) throws Exception {
        assertEquals(result, calculatorServiceIml.calculatorMinus(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 6", "4,5,20"})
    public void multiplicationTest(int a, int b, int result) throws Exception {
        assertEquals(result, calculatorServiceIml.calculatorMultiplication(a, b));
    }

    @ParameterizedTest
    @CsvSource({"4, 2, 2", "10,5,2"})
    public void divisionTest(BigDecimal a, BigDecimal b, BigDecimal result) throws Exception {
        assertEquals(result, calculatorServiceIml.calculatorDivision(a, b));
    }
}

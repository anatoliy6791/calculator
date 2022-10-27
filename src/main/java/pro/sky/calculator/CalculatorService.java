package pro.sky.calculator;

import java.math.BigDecimal;

public interface CalculatorService {

    String calculator();

    int calculatorSum(Integer num1, Integer num2);

    int calculatorMinus(Integer num1,Integer num2);

    int calculatorMultiplication(Integer num1, Integer num2);

    BigDecimal calculatorDivision(BigDecimal num1, BigDecimal num2);
}

package pro.sky.calculator;

public interface CalculatorService {
    String hello();

    String calculator();

    String calculatorSum(Integer num1, Integer num2);

    String calculatorMinus(Integer num1, Integer num2);

    String calculatorMultiplication(Integer num1, Integer num2);

    String calculatorDivision(Integer num1, Integer num2);
}

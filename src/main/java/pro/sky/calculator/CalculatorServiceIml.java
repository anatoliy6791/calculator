package pro.sky.calculator;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorServiceIml implements CalculatorService {

    @Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int calculatorSum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new RuntimeException("Вы не ввели число");
        } else {
            int result = num1 + num2;
            return result;
        }
    }

    @Override
    public int calculatorMinus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new RuntimeException ("Вы не ввели число");
        } else {
            int result = num1 - num2;
            return result;
        }
    }

    @Override
    public int calculatorMultiplication(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new RuntimeException ("Вы не ввели число");
        } else {
            int result = num1 * num2;
            return result;
        }
    }

    @Override
    public BigDecimal calculatorDivision(BigDecimal num1, BigDecimal num2) {
        if (num1 == null || num2 == null) {
            throw new RuntimeException ("Вы не ввели число");
        } else if (num2.equals(new BigDecimal(0))) {
            throw new RuntimeException ("На ноль делить нельзя");
        } else {
            BigDecimal result = num1.divide(num2);
            return result;
        }
    }
}
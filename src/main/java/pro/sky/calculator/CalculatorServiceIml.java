package pro.sky.calculator;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exception.ZeroDivisionException;

import java.math.BigDecimal;

@Service
public class CalculatorServiceIml implements CalculatorService {

    @Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int calculatorSum(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Вы не ввели число");
        } else {
            int result = a + b;
            return result;
        }
    }


    @Override
    public int calculatorMinus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Вы не ввели число");
        }

        int result = a - b;
            return result;
        }


    @Override
    public int calculatorMultiplication(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Вы не ввели число");
        }

        int result = a * b;
            return result;
        }


    @Override
    public BigDecimal calculatorDivision(BigDecimal a, BigDecimal b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Вы не ввели число");
        } else if (b.equals(new BigDecimal(0))) {
            throw new ZeroDivisionException("На ноль делить нельзя");
        }
        BigDecimal result = a.divide(b);
            return result;
        }
    }

package pro.sky.calculator;

import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceIml implements CalculatorService {

    @Override
    public String hello() {
        return "Hello";
    }

    @Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String calculatorSum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Вы не ввели число";
        } else {
            int result = num1 + num2;
            return num1 + "+" + num2 + "=" + result;
        }
    }

    @Override
    public String calculatorMinus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Вы не ввели число";
        } else {
            int result = num1 - num2;
            return num1 + "-" + num2 + "=" + result;
        }
    }

    @Override
    public String calculatorMultiplication(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Вы не ввели число";
        } else {
            int result = num1 * num2;
            return num1 + "*" + num2 + "=" + result;
        }
    }
    @Override
    public String calculatorDivision(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Вы не ввели число";
        } else {
            int result = num1 / num2;
            return num1 + "/" + num2 + "=" + result;
        }
    }
}
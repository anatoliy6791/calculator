package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {

    private final CalculatorService calculatorServiceIml;

    public CalculatorController(CalculatorService calculatorServiceIml) {
        this.calculatorServiceIml = calculatorServiceIml;
    }

    @GetMapping()
    public String calculator() {
        return calculatorServiceIml.calculator();
    }

    @GetMapping(path ="/plus")
    public String calcSum(@RequestParam(name = "num1") Integer a,  @RequestParam(name = "num2")  Integer b) {
        if (a == null || b == null) {
            return ("Вы не ввели число");
        }
        return a + " + " + b + " = " + calculatorServiceIml.calculatorSum(a, b);
    }

    @GetMapping(path ="/minus")
    public String calcMinus(@RequestParam(name = "num1") Integer a,  @RequestParam(name = "num2")  Integer b) {
        if (a == null || b == null) {
            return "Вы не ввели число";
        }
        return a + " - " + b + " = " + calculatorServiceIml.calculatorMinus(a, b);
    }

    @GetMapping(path ="/multiply")
    public String calcMultipication(@RequestParam(name = "num1") Integer a,  @RequestParam(name = "num2")  Integer b) {
        if (a == null || b == null) {
            return "Вы не ввели число";
        }
        return a + " * " + b + " = " + calculatorServiceIml.calculatorMultiplication(a,b);
    }

    @GetMapping(path ="/divide")
    public String calcDivision(@RequestParam(name = "num1") BigDecimal a, @RequestParam(name = "num2")  BigDecimal b) throws RuntimeException {
        if (a == null || b == null) {
            return ("Вы не ввели число");
        } else if (b.equals(new BigDecimal(0))) {
            return "На ноль делить нельзя";
        }
        return a + " / " + b + " = " + calculatorServiceIml.calculatorDivision(a, b);
    }
}

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
    public Integer calcSum(@RequestParam(name = "num1") Integer a,  @RequestParam(name = "num2")  Integer b) {
        return calculatorServiceIml.calculatorSum(a, b);
    }

    @GetMapping(path ="/minus")
    public Integer calcMinus(@RequestParam(name = "num1") Integer a,  @RequestParam(name = "num2")  Integer b) {
        return calculatorServiceIml.calculatorMinus(a, b);
    }

    @GetMapping(path ="/multiply")
    public Integer calcMultipication(@RequestParam(name = "num1") Integer a,  @RequestParam(name = "num2")  Integer b) {
        return calculatorServiceIml.calculatorMultiplication(a, b);
    }

    @GetMapping(path ="/divide")
    public BigDecimal calcDivision(@RequestParam(name = "num1") BigDecimal a, @RequestParam(name = "num2")  BigDecimal b) throws RuntimeException {
        return calculatorServiceIml.calculatorDivision(a, b);
    }
}

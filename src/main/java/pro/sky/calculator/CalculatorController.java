package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorServiceIml;

    public CalculatorController(CalculatorService calculatorServiceIml) {
        this.calculatorServiceIml = calculatorServiceIml;
    }
    @GetMapping
    public String hello() {
        return calculatorServiceIml.hello();
    }
    @GetMapping(path ="/calculator")
    public String calculator() {
        return calculatorServiceIml.calculator();
    }

    @GetMapping(path ="/calculator/plus")
    public String calcSum(@RequestParam(name = "num1") int a,  @RequestParam(name = "num1")  int b) {
        return calculatorServiceIml.calculatorSum(a,b);
    }

    @GetMapping(path ="/calculator/minus")
    public String calcMinus(@RequestParam(name = "num1") int a,  @RequestParam(name = "num1")  int b) {
        return calculatorServiceIml.calculatorMinus(a,b);
    }

    @GetMapping(path ="/calculator/multiply")
    public String calcMultipication(@RequestParam(name = "num1") int a,  @RequestParam(name = "num1")  int b) {
        return calculatorServiceIml.calculatorMultiplication(a,b);
    }

    @GetMapping(path ="/calculator/divide")
    public String calcDivision(@RequestParam(name = "num1") int a,  @RequestParam(name = "num1")  int b) {
        return calculatorServiceIml.calculatorDivision(a,b);
    }
}

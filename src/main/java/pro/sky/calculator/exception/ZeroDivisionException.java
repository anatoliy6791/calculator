package pro.sky.calculator.exception;

public class ZeroDivisionException extends IllegalArgumentException {
    public ZeroDivisionException(String message){
        super(message);
    }
}

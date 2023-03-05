package lessons.lesson19;

public class MathValidationException extends ArithmeticException {
    public String message2;
    public MathValidationException(String message) {
        super(message);
        this.message2 = "divide by zero";
    }
}

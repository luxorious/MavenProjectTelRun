package JavaPro;

import lessons.lesson21.jUnit.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void shouldSum(){
        int a = 5;
        int b = 10;
        int expected = 15;
        int actual = calculator.sum(a,b);

        assertEquals(expected, actual);
    }
}

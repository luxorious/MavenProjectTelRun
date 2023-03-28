package lessons.lesson23.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxDemoTest {

    private TaxCalculatorImpl tc = new TaxCalculatorImpl();

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero(){
        Double income = 0.0;
        Double taxToPay = tc.calculatorTax(income);
        assertEquals(taxToPay, 0);
    }
    @Test
    public void shouldPay25TaxWhenIncomeLess20000(){
        Double income = 10000.0;
        Double taxToPay = tc.calculatorTax(income);
        assertEquals(taxToPay, 2500);
    }
    @Test
    public void shouldPay25TaxWhenIncomeEqualsLess20000(){
        Double income = 20000.0;
        Double taxToPay = tc.calculatorTax(income);
        assertEquals(taxToPay, 5000);
    }
    @Test
    public void shouldPay25And40TaxWhenIncomeEqualsMore20000(){
        Double income = 40000.0;
        Double taxToPay = tc.calculatorTax(income);
        assertEquals(taxToPay, 13000);
    }
}
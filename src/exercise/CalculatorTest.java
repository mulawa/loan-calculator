package exercise;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void calcConstantPayment() {
        Calculator calculator = new Calculator();
        Result result = calculator.calcConstantPayment(1000.00, 0.25, 1, 12);
        System.out.println(result);

        assertEquals(1140.53, (double)Math.round(result.getTotal().doubleValue() * 100) / 100);

    }

    @Test
    void calcDecreasingPayment() {
        Calculator calculator = new Calculator();
        Result result = calculator.calcDecreasingPayment(55000.50, 0.50, 3, 12);
        System.out.println(result);

        assertEquals(98343.74, (double)Math.round(result.getTotal().doubleValue() * 100) / 100);

    }
}
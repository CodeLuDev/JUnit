package entity;

import org.example.entity.DiscountCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {

    @Test
    public void discountTest() {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        Assertions.assertEquals(4,discountCalculator.calculateDiscount(5,20));
        Assertions.assertEquals(8,discountCalculator.calculateDiscount(10,20));
        Assertions.assertEquals(16,discountCalculator.calculateDiscount(20,20));
    }

}

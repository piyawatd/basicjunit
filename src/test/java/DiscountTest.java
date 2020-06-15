import com.piyawat.basicjunit.Discount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    Discount discount;

    @BeforeEach
    public void setUp() {
        discount = new Discount();
    }

    @Test
    void discountPerUnitPercent() {
        assertEquals(90,discount.discountPerUnitPercent(1,100.00,10.00));
    }

    @Test
    void discountPerUnitPrice() {
        assertEquals(90,discount.discountPerUnitPrice(1,100.00,10.00));
    }

    @Test
    void discountMultiPercent() {
        assertEquals(180,discount.discountMultiPercent(2,100.00,10.00));
    }

    @Test
    void discountMulitPrice() {
        assertEquals(190,discount.discountMulitPrice(2,100.00,10.00));
    }

    @Test
    void discountTotalPercent() {
        assertEquals(950.00,discount.discountTotalPercent(1000.00,5.00));
    }

    @Test
    void discountTotalPrice() {
        assertEquals(900.00,discount.discountTotalPrice(1000.00,100.00));
    }

    @Test
    void free() {
        assertEquals(100.00,discount.free(2,100.00));
    }
}
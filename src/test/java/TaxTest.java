import com.piyawat.basicjunit.Tax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxTest {

    Tax tax;

    @BeforeEach
    public void setUp() {
        tax = new Tax();
    }

    @Test
    void addVat() {
        assertEquals(7.00,tax.addVat(100.00));
    }

    @Test
    void revertVat() {
        assertEquals(65.42,tax.revertVat(1000.00));
    }
}
import com.piyawat.basicjunit.Email;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    Email email;

    @BeforeEach
    public void setUp() {
        email = new Email();
    }

    @Test
    void checkSpaceBefore() {
        assertFalse(email.checkSpaceBefore(" testemail@gmail.com"));
    }

    @Test
    void checkSpaceAfter() {
        assertFalse(email.checkSpaceAfter("testemail@gmail.com "));
    }

    @Test
    void checkSpace() {
        assertFalse(email.checkSpace(" testemail@gmail.com "));
    }

    @Test
    void checkBlank() {
        assertFalse(email.checkBlank(""));
    }

    @Test
    void checkNoAtSign() {
        assertFalse(email.checkNoAtSign(" testemail"));
    }

    @Test
    void checkBlankBeforeAtSign() {
        assertFalse(email.checkBlankBeforeAtSign("@gmail.com"));
    }

    @Test
    void checkEmailName() {
        assertFalse(email.checkEmailName("testemail#@gmail.com"));
    }

    @Test
    void checkDot() {
        assertFalse(email.checkDot("testemail@gmail"));
    }

    @Test
    void checkUniqueEmail() {
        assertFalse(email.checkUniqueEmail("testemail@gmail.com"));
    }
}
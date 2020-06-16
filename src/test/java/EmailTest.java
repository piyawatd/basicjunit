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
        assertTrue(email.checkSpaceBefore("testemail@gmail.com"));
    }

    @Test
    void checkSpaceAfter() {
        assertFalse(email.checkSpaceAfter("testemail@gmail.com "));
        assertTrue(email.checkSpaceAfter("testemail@gmail.com"));
    }

    @Test
    void checkSpace() {
        assertFalse(email.checkSpace(" testemail@gmail.com "));
        assertTrue(email.checkSpace("testemail@gmail.com"));
    }

    @Test
    void checkBlank() {
        assertFalse(email.checkBlank(""));
        assertTrue(email.checkBlank("testemail@gmail.com"));
    }

    @Test
    void checkNoAtSign() {
        assertFalse(email.checkNoAtSign(" testemail"));
        assertTrue(email.checkNoAtSign("testemail@gmail.com"));
    }

    @Test
    void checkBlankBeforeAtSign() {
        assertFalse(email.checkBlankBeforeAtSign("@gmail.com"));
        assertTrue(email.checkBlankBeforeAtSign("testemail@gmail.com"));
    }

    @Test
    void checkEmailName() {
        assertFalse(email.checkEmailName("testemail#@gmail.com"));
        assertTrue(email.checkEmailName("testemail@gmail.com"));
    }

    @Test
    void checkDot() {
        assertFalse(email.checkDot("testemail@gmail"));
        assertTrue(email.checkDot("testemail@gmail.com"));
    }

    @Test
    void checkUniqueEmail() {
        assertFalse(email.checkUniqueEmail("testemail@gmail.com"));
        assertTrue(email.checkUniqueEmail("test@gmail.com"));
    }

    @Test
    void checkEmailPass() {
        assertTrue(email.checkEmailName("test@gmail.com"));
    }
}
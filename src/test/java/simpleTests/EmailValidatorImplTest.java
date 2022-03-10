package simpleTests;

import implementationsAndInterface.EmailValidatorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailValidatorImplTest {

    private EmailValidatorImpl validator = new EmailValidatorImpl();

    @Test
    void valid() {
        assertTrue(validator.validate("abcdef@mail.ru"));
        assertTrue(validator.validate("h@mail.ru"));
    }

    @Test
    void invalid() {
        assertFalse(validator.validate("42"));
        assertFalse(validator.validate("abc.def@mail"));
    }

}
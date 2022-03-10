package simpleTests;

import implementationsAndInterface.PhoneValidatorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneValidatorImplTest {

    private PhoneValidatorImpl validator = new PhoneValidatorImpl();

    @Test
    void valid() {
        assertTrue(validator.validate("+79604803418"));
        assertTrue(validator.validate("8(495)5674893"));
    }

    @Test
    void invalid() {
        assertFalse(validator.validate("42"));
        assertFalse(validator.validate("abc.def@mail"));
    }

}
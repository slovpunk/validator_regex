package simpleTests;

import implementationsAndInterface.NumbersWithPointValidatorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumbersWithPointValidatorImplTest {

    private NumbersWithPointValidatorImpl validator = new NumbersWithPointValidatorImpl();

    @Test
    void valid() {
        assertTrue(validator.validate("23.78"));
        assertTrue(validator.validate("-77.234"));
    }

    @Test
    void invalid() {
        assertFalse(validator.validate("345,234"));
        assertFalse(validator.validate("abc.def@mail"));
    }

}
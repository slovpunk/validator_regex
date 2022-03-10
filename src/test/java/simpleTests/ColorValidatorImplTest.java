package simpleTests;

import implementationsAndInterface.ColorValidatorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ColorValidatorImplTest {

    private ColorValidatorImpl colorValidator = new ColorValidatorImpl();

    @Test
    void valid() {
        assertTrue(colorValidator.validate("#AABB12"));
        assertTrue(colorValidator.validate("#777"));
    }

    @Test
    void invalid() {
        assertFalse(colorValidator.validate("42"));
        assertFalse(colorValidator.validate("abc.def@mail"));
    }

}
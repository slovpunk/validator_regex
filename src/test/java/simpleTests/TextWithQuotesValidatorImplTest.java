package simpleTests;

import implementationsAndInterface.TextWithQuotesValidatorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TextWithQuotesValidatorImplTest {

    private TextWithQuotesValidatorImpl validator = new TextWithQuotesValidatorImpl();

    @Test
    void valid() {
        assertTrue(validator.validate("\"two words\""));
        assertTrue(validator.validate("\"word\""));
    }

    @Test
    void invalid() {
        assertFalse(validator.validate("\"42..\""));
        assertFalse(validator.validate("\"abc.def@mail\""));
    }

}
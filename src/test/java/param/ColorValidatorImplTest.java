package param;

import implementationsAndInterface.ColorValidatorImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ColorValidatorImplTest {

    private ColorValidatorImpl colorValidator = new ColorValidatorImpl();

    @ParameterizedTest
    @ValueSource(strings = { "#7878DS", "#asd87", "#a"})
    void valid(String colorValidate) {
        assertTrue(colorValidator.validate(colorValidate));
    }

    @ParameterizedTest
    @ValueSource(strings = { "+", "-+42", "1.2.3", "1e"})
    void invalid(String candidate) {
        assertFalse(colorValidator.validate(candidate));
    }

}
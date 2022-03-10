package param;

import implementationsAndInterface.EmailValidatorImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailValidatorImplTest {

    private EmailValidatorImpl validator = new EmailValidatorImpl();

    @ParameterizedTest
    @ValueSource(strings = { "a@mail.ru", "a.a@mail.ru", "a@b.com"})
    void valid(String candidate) {
        assertTrue(validator.validate(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = { "+", "-+42", "1.2.3", "1e"})
    void invalid(String candidate) {
        assertFalse(validator.validate(candidate));
    }

}
package param;

import implementationsAndInterface.TimeValidatorImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TimeValidatorImplTest {

    private TimeValidatorImpl validator = new TimeValidatorImpl();

    @ParameterizedTest
    @ValueSource(strings = { "12.3.2022 17:45:33", "12.3.20 17:45"})
    void valid(String candidate) {
        assertTrue(validator.validate(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = { "40.3.2022 17:45:33", "29.02.2022 17:45:33", "1.2.3", "1e"})
    void invalid(String candidate) {
        assertFalse(validator.validate(candidate));
    }

}
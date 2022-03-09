package implementationsAndInterface;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeValidatorImpl implements MyValidator {

    private static final Pattern pattern =
            Pattern.compile("(\\d{2})\\.(\\d{1,2})\\.(\\d{2}|\\d{4})\\s*(\\d{2}):(\\d{2}):*(\\d{2})*");

    @Override
    public boolean validate(String string) {
        Matcher matcher = pattern.matcher(string);

        if (!matcher.matches()) {
            return false;
        }
        try {
            LocalDateTime.of(Integer.parseInt(matcher.group(3)),
                    Integer.parseInt(matcher.group(2)),
                    Integer.parseInt(matcher.group(1)),
                    Integer.parseInt(matcher.group(4)),
                    Integer.parseInt(matcher.group(5)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String name() {
        return "time";
    }
}

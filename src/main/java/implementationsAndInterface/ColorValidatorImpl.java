package implementationsAndInterface;

import java.util.regex.Pattern;

public class ColorValidatorImpl implements MyValidator {

    private static final Pattern pattern = Pattern.compile("#([a-fA-F0-9]{3}|[a-fA-F0-9]{6})");

    @Override
    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    @Override
    public String name() {
        return "color from html page";
    }
}

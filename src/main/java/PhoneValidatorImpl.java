import java.util.regex.Pattern;

public class PhoneValidatorImpl implements MyValidator {

    private static final Pattern pattern = Pattern.compile("(8|\\+7)(((\\([4-9]\\d{2}\\))\\d{7})|\\d{10})");

    @Override
    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    @Override
    public String name() {
        return "phone number";
    }
}

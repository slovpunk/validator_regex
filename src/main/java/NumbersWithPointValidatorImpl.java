import java.util.regex.Pattern;

public class NumbersWithPointValidatorImpl implements MyValidator {

    private static final Pattern pattern = Pattern.compile("[-]?\\d+[.]?[\\d+]*");
//    private static final Pattern pattern = Pattern.compile("\\b\\d{2}\\b");


    @Override
    public boolean validate(String string) {
        return pattern.matcher(string).matches();
    }

    @Override
    public String name() {
        return "just number";
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyValidator[] myValidators = {new EmailValidatorImpl(), new PhoneValidatorImpl(),
                new NumbersWithPointValidatorImpl(), new TextWithQuotesValidatorImpl(), new TimeValidatorImpl(),
                new ColorValidatorImpl()};
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();

            if (string.equals("exit")) {
                break;
            }

            boolean ok = false;
            for (MyValidator myValidator : myValidators) {
                if (myValidator.validate(string)) {
                    System.out.println("It's " + myValidator.name());
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.println("i don't know");
            }
        }
    }
}

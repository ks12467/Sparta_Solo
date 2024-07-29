package calculator;

public class badExceptions extends Exception {
    public badExceptions(String message) {
        super("올바른 값이 아닙니다. " + message);
    }

}

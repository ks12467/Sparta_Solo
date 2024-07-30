package calculator;

public class DivideOperator implements Operator {

    public double operate(double num1, double num2) throws badExceptions {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new badExceptions("입력값이 올바르지 않습니다.");
        }
    }
}

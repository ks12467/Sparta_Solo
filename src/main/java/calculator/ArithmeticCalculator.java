package calculator;

public class ArithmeticCalculator extends Calculator {


    public static double calculate(double num1, double num2, char operator) throws badExceptions {
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new badExceptions("입력값이 올바르지 않습니다.");
                }
                break;
            default:
                throw new badExceptions("연산자 입력이 올바르지 않습니다.");
        }

        System.out.println("결과 : " + result);
        getResults().add(result);
        printReuslt(result);
        return result;
    }
}
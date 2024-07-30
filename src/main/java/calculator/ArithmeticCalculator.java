package calculator;

public class ArithmeticCalculator extends Calculator {
    private Operator add;
    private Operator subtract;
    private Operator multiply;
    private Operator divide;

    public ArithmeticCalculator() {
        this.add = new AddOperator();
        this.subtract = new SubtractOperator();
        this.multiply = new MultiplyOperator();
        this.divide = new DivideOperator();
    }

    public double calculate(double num1, double num2, char operator) throws badExceptions {
        double result;
        switch (operator) {
            case '+':
                result = add.operate(num1, num2);
            break;
            case '-':
                result = subtract.operate(num1, num2);
            break;
            case '*':
                result = multiply.operate(num1, num2);
            break;
            case '/':
                result = divide.operate(num1, num2);
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
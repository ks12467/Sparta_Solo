package calculator;

//Operator 의 인터페이스 구현 및 곱셈 연산
public class MultiplyOperator implements Operator {

    public double operate(double num1, double num2) {

        return num1 * num2;
    }
}

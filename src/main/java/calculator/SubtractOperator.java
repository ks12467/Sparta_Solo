package calculator;

//Operator의 인터페이스 구현 및 뺄셈 연산
public class SubtractOperator implements Operator {

    public double operate(double num1, double num2){

        return num1 - num2;
    }
}

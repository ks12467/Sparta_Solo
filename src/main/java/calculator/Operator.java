package calculator;
//Operator 추상 메서드 구현
public interface Operator {
    double operate(double num1, double num2) throws badExceptions;
}

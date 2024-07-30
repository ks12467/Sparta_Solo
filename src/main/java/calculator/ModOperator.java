package calculator;

//Operator 의 인터페이스 구현 및 나머지 연산
public class ModOperator implements Operator {
    public double operate(double num1, double num2) throws badExceptions {
            if (num2 == 0) {
                throw new badExceptions(" 입력 값이 올바르지 않습니다, ");
            }
            return num1 % num2;
        }
    }

package calculator;

import java.util.ArrayList;

public class Calculator {
    public int Calculate(int num1, int num2, char operator) throws badExceptions {
        ArrayList<Integer> results = new ArrayList<>();
        int result;

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
        results.add(result);

        return result;
    }
}


package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char operator) throws badExceptions {
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


        for (int i = 0; i < results.size(); i++) {
            System.out.println((i + 1) + " : " + results.get(i));

        }
        return result;
    }
    public List<Integer> getResults() {
        return results;
    }


    public void removeOldestResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }


}
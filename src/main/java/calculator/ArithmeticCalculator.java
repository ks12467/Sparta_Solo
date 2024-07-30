package calculator;

import java.util.Map;
import java.util.HashMap;

//Calculator에 상속 받는 연산을 처리하는 클래스
public class ArithmeticCalculator extends Calculator {
    // HashMap 사용으로 데이터 추가 및 삭제 / 검색을 빠르게 하기 위해 HashMap 사용
    private Map<Character, Operator> operators = new HashMap<>();
    
    //연산을 수행할 객체를 Map에 등록
    public ArithmeticCalculator(){
        operators.put('+', new AddOperator());
        operators.put('-', new SubtractOperator());
        operators.put('*', new MultiplyOperator());
        operators.put('/', new DivideOperator());
        operators.put('%', new ModOperator());
    }
    
    public double calculator(double num1, double num2, char operator) throws Exception{
        Operator op = operators.get(operator);
        double result = op.operate(num1, num2);
        if(op == null){
            throw new badExceptions("입력 값이 올바르지 않습니다");
        }

        System.out.println("결과 : " + result);
        getResults().add(result);
        printReuslt();
        return result;
    }
}
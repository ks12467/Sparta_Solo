package calculator;

import java.util.Map;
import java.util.HashMap;

public class ArithmeticCalculator extends Calculator {
    private Map<Character, Operator> operators = new HashMap<>();
    
    
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
        printReuslt(result);
        return result;
    }
}
package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        while (true) {
            try {
                /* 기록확인 및 계산을 더 할 것인지를 추가함 */
                System.out.println("계산 진행 y / 기록 확인 history / 원의 넓이 구하기(circle) : ");
                /* 문자를 입력받기 위한 메서드 */
                String str = sc.next();
                /* equeals = 객체간의 값을 비교 */
                if (str.equals("history")) {
                    // 저장돤 결과가 없으면 아래 코드 실행 /
                    if (calc.getResults().isEmpty()) {
                        calc.inquiryResults();
                    } else {
                        //결과가 있으면 아래 코드 실행
                        calc.inquiryResults();
                    }
                    // 원의 넓이 구하는 메서드
                } else if(str.equals("circle")){
                    System.out.println("원의 넓이를 구합니다. / 원의 반지름을 입력해주새요.");
                    double radius = sc.nextDouble();
                    double area = CircleCalculator.calculateCircleArea(radius);
                    System.out.println("원의 넓이 = " + area);
                    continue;
                }
                else if (str.equals("y")) {
                    System.out.println("계산을 시작합니다.");
                } else {
                    //입력한 값이 올바르지 않을 경우 출력
                    System.out.println("올바른 값이 아닙니다.");
                    continue;
                }
                // 연산자를 입력받기 위한 메서드
                System.out.print("첫 번째 숫자를 입력하시오. : ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하시오. : ");
                int num2 = sc.nextInt();
                System.out.print("연산 기호를 입력하시오. : ");
                char operator = sc.next().charAt(0);

                //Calculator의 calculate() 메서드를 호출합니다.
                double result = arithmeticCalculator.calculator(num1, num2, operator);

                //예외 클래스 생성하여 오류 발생 시 아래 코드 실행
            } catch (Exception e) {
                System.out.println("올바르지 않습니다. ");
                continue;
            }

            System.out.println("계산을 더 하신거나 결과를 삭제하시겠습니까? (y/n/remove)");
            String str = sc.next();

            //결과 값 삭제 메서드
            if (str.equals("y")) {
                System.out.println("계산을 다시 시작합니다.");
            } else if (str.equals("remove")) {
                List<Double> results = calc.getResults();
                calc.removeResult();

            } else if (str.equals("n")) {
                System.out.println("계산을 종료합니다");
                break;
            } else {
                System.out.println("입력한 값이 올바르지 않습니다.");
            }
        }
    }
}
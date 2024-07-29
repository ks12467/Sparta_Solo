package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();


        while (true) {
            try {
                /* 기록확인 및 계산을 더 할 것인지를 추가함 */
                System.out.println("계산 진행 y / 기록 확인 history");
                /* 문자를 입력받기 위한 메서드 */
                String str = sc.next();
                /* equeals = 객체간의 값을 비교 */
                if (str.equals("history")) {
                    /* 만약에 results에 저장된 값이 없으면 아래 문장 출력*/
                    if (calc.getResults().isEmpty()) {
                        calc.inquiryResults();
                    } else {
                        calc.inquiryResults();
                    }

                } else if (str.equals("y")) {
                    System.out.println("계산을 시작합니다.");
                } else {
                    System.out.println("올바른 값이 아닙니다.");
                    continue;
                }

                System.out.print("첫 번째 숫자를 입력하시오. : ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하시오. : ");
                int num2 = sc.nextInt();
                System.out.print("연산 기호를 입력하시오. : ");
                char operator = sc.next().charAt(0);

                int result = calc.calculate(num1, num2, operator);

            } catch (Exception e) {
                System.out.println("올바르지 않습니다. ");
                continue;
            }



            System.out.println("계산을 더 하신거나 결과를 삭제하시겠습니까? (y/n/remove)");
            String str = sc.next();

            if (str.equals("y")) {
                System.out.println("계산을 다시 시작합니다.");
            } else if (str.equals("remove")) {
                List<Integer> results = calc.getResults();
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
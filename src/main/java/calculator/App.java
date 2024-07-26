package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*Scanner를 사용하여 입력 값을 받을 수 있음 */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();


        while (true) {
            System.out.println("계산 진행 y / 기록 확인 history");
            String str = sc.next();

            if (str.equals("history")) {
                if (results.isEmpty()) {
                    results.toString();
                    System.out.println("기록이 없습니다.");
                    continue;
                } else {
                    results.toString();
                    System.out.println("저장된 기록 확인");
                    System.out.println(results.toString());
                }
            } else if (str.equals("y")) {
                System.out.println("계산을 시작합니다.");
            } else {
                System.out.println("입력 값이 올바르지 않습니다.");
                continue;
            }
            System.out.print("첫 번째 숫자를 입력하시오. : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하시오. : ");
            int num2 = sc.nextInt();

            System.out.print("연산 기호를 입력하시오. : ");
            char operator = sc.next().charAt(0);

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
                        System.out.println("다른 값을 입력해주세요");
                        continue;
                    }
                    break;
                default:
                    System.out.println("연산자가 바르지 않습니다.");
                    continue;
            }
            System.out.println("결과 : " + result);
            results.add(result);

            for (int i = 0; i < results.size(); i++) {
                System.out.println((i + 1) + " : " + results.get(i));
            }

            System.out.println("계산을 더 하신거나 결과를 삭제하시겠습니까? (y/n/remove)");
            str = sc.next();

            if (str.equals("y")) {
                System.out.println("계산을 다시 시작합니다.");
            } else if (str.equals("remove")) {
                if (!results.isEmpty()) {
                    results.remove(0);
                    System.out.println("가장 오래 된 기록이 삭제되었습니다.");
                } else {
                    System.out.println("가장 오래 된 기록이 없습니다.");
                }
            } else if (str.equals("n")) {
                System.out.println("계산을 종료합니다");
                break;
            } else {
                System.out.println("입력한 값이 올바르지 않습니다.");
            }
        }

    }
}
package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*Scanner를 사용하여 입력 값을 받을 수 있음 */
        Scanner sc = new Scanner(System.in);
        int[] results = new int[10];
        int resultCount = 0;

        while (true) {
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
            results[resultCount] = result;
            resultCount++;

            System.out.println("계산을 더 하시겠습니까? (y/n)");
            String str = sc.next();

            if (str.equals("y")) {
                System.out.println("계산을 다시 시작합니다.");
                for (int i= 0; i < results.length; i++){
                    System.out.println(i + " : " + results[i]);
                }

            } else {
                System.out.println("계산을 종료합니다");
                break;
            }

        }
    }
}
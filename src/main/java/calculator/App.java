package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*Scanner를 사용하여 입력 값을 받을 수 있음 */
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하시오. : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하시오. : ");
        int num2 = sc.nextInt();

        System.out.print("연산 기호를 입력하시오. : ");
        char operator = sc.next().charAt(0);
        

    }
}

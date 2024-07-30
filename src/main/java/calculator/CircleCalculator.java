package calculator;

import java.util.List;

public class CircleCalculator extends Calculator{
    // Math PI = 원주율 / 원주율은 변하지 않는 값이므로 static - final 을 사용하였습니다.
    private static final double PI = Math.PI;

    public static double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius; // 원의 넓이를 구한다 PI * 반지름 * 반지름
        getResults().add(area); // 결과를 results에 추가
        printReuslt(); //저장된 결과를 출력
        return area;
    }

}

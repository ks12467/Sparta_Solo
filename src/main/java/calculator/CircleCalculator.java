package calculator;

import java.util.List;

public class CircleCalculator extends Calculator{

    private static final double PI = Math.PI;

    // Math PI = 원주율 / 원주율은 변하지 않는 값이므로 static - final 을 사용하였습니다.
    public static double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        getResults().add(area);
        printReuslt(area);
        return area;
    }

}

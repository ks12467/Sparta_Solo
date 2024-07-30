package calculator;

import java.util.ArrayList;
import java.util.List;

//계산 결과를 저장하고 관리
public class Calculator {

    //결과를 저장할 list를 선언
    private static List<Double> results;

    //결과를 반환하기 위한 메서드
    public static List<Double> getResults() {
        return results;

    }
    //results 를 초기화 시키기 위한 생성자
    public Calculator() {
        this.results = new ArrayList<>();
    }
    //결과 값 출력 메서드
    public static void printReuslt() {
        if (results.isEmpty()) {  // 결과 값이 없을 때 아래 문장 출력
            System.out.println("기록이 없습니다.");
        } else {
            System.out.println("저장된 결과입니다."); // 결과 값이 존재할 때
            for (int i = 0; i < results.size(); i++) {
                System.out.println((i + 1) + " 번째 결과 : " + results.get(i));
            }
        }
    }
    //가장 오래된 순서로 결과 값 삭제
    public void removeResult() {
        if (!results.isEmpty())  { //결과가 있을 때 가장 오래된 기록 삭제
            results.remove(0);
            System.out.println("가장 오래된 기록을 1개 삭제했습니다");
        } else { //저장 값이 없을 때 아래 문장 출력)
            System.out.println("기록이 없습니다.");
        }
    }


}
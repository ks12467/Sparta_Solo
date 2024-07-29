package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private static List<Double> results;

    public static List<Double> getResults() {
        return results;

    }

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public static void printReuslt(double result) {
        if(results.isEmpty()){
            System.out.println("기록이 없습니다.");
        }else {
            System.out.println("저장된 결과입니다.");
            for(int i= 0; i<results.size(); i++){
                System.out.println((i +1) + " 번째 결과 : " + results.get(i));
            }
        }
    }




    public void inquiryResults() {
        if (results.isEmpty()) {
            System.out.println("기록이 없습니다.");
        } else {
            System.out.println("저장된 기록 확인");
            int index = 1;
            for (double result : results) {
                System.out.println("[" + index + "] " + result);
            }
        }
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 오래된 기록을 1개 삭제했습니다");
        } else {
            System.out.println("기록이 없습니다.");
        }
    }


}
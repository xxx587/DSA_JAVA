package day6;

public class NestedLoop {
    public static void main(String[] args) {

        int dan;
        int times;

        for (dan = 2; dan <= 9; dan++) { //1단부터 9단까지 반복하는 외부 반복문
            for (times = 1; times <= 9; times++) { //각 단에서 1~9를 곱하는 내부 반복문
                System.out.printf("%d X %d = %d%n", dan, times, dan * times);
            }
            System.out.println("-------");
        }
    }
}


/*
숙제
1. 윤년 계산기
2. bmi 계산기
3. 사칙연산 계산기
4. 구구단 출력기
 */
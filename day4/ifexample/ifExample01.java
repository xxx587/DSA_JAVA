package day4.ifexample;

public class ifExample01 {
    public static void main(String[] args) {
        //조건문
        /*
        if (조건식) {
        참을 반환할 때 실행할 수행문;
        }
        조건은 논리값을 반환하여야 한다.
        -> 자바에서 조건식은 반드시 논리형의 데이터를 반환하는 식이어야 한다.
           (자바는 타입에 엄격한 언어이기 때문에 '참으로 평가되는 값'이라는개념이 없다.)
        수행문은 중괄호로 묶어서 나타내며, 중괄호로 묶은 부분을 블록이라고 한다.
         */

        String name = "철수";
        int age = 7;
        if (age >= 8) {
            System.out.println(name + "은(는) 학교에 다닙니다");
        } else {
            System.out.println(name + "은(는) 학교에 다니지 않습니다");
        }
    }
}

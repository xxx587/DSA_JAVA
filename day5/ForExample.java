package day5;

public class ForExample {
    public static void main(String[] args) {

        /*
        for
        for (초기화식(1); 조건식(2)(5); 증감식(4)(7);) {
            수행문(3)(6);
        }

        ()안의 숫자는 실행 순서

        for문 괄호 안의 세 요소는 모두 생략 가능하다
        초기화식 : 반복 전에 이미 초기화된 변수를 사용하는 경우 생략 가능
        조건식 : 반복을 중간에 멈추고자 할때, 조건을 블록 내의 제어문을 추가하여 처리하면 조건식을 생략할 수 있다.
        증감식 : 증감식이 복잡하거나 다른 변수의 상태에 따라 달라질 경우, 증감처리를 블록 안에서 직접 수행할 수 있다
        */

        int sum = 0;
        int i = 0;

        for (; ; ) {
            sum += i;
            System.out.println("i확인 " + i);
            System.out.println(sum);
            System.out.println("----------");
            if (i >= 10) {
                break; //break로 반복문 자체를 빠져나가게 함
            } else i++;
        }

        System.out.println("1부터" + i + "까지의 합은 " + sum);


    }
}



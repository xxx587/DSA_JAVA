package day5;

public class WhileExample {
    public static void main(String[] args) {

        /*
        while문
        while (조건식){
            실행문;
        }
        조건은 boolean 값을 반환해야 하며 참을 반환하는 동안 실행문을 반복
        실행내용은 중괄호 안에 들어있음 while 문의 중활호 끝에는 세미콜론을 쓰지 않음
        */

        int num = 1;
        int sum = 0; //누산 결과를 담을 변수

        while (num <= 10) {
            sum += num;
            num++;
        }   //조건부터 확인

        System.out.println("1부터 10까지의 합은 " + sum);

    }
}

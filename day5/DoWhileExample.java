package day5;

public class DoWhileExample {
    public static void main(String[] args) {

        /*
        do-while
        do {
            실행문;    //조건식이 참이 아니더라도 우선 1회 실행
        } while (조건식);
        //문 자체가 1회 실행되는 것을 상정하므로 끝에 세미콜론을 쓴다
         */

        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num++;
        } while (num <= 10);
        //먼저 실행부터 하고 조건 확인

        System.out.println("1부터 10까지의 합은 " + sum);

    }
}

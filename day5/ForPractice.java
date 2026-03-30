package day5;


public class ForPractice {
    public static void main(String[] args) {
        // 1~@까지의 합이 100 이상일 때 @와 100이상이 된 누산값을 출력

        int i;
        int sum = 0;

        for (i = 1; sum <= 100; i++) {
            sum += i;
        }

        System.out.println("1부터 " + (i -1) + "까지의 합은 " + sum + "로 100 이상이 된다");
    }
}

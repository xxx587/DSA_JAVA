package PRPR.BookPR;

public class ContinueExample {
    public static void main(String[] args) {
        //continue 문을 활용해 1부터 100까지 홀수만 더하기
        int sum = 0;
        int num;

        for (num = 1; num <= 100; num++) {
            if (num %2 == 0)
                continue;
            sum += num;
        }

        System.out.println("1부터 100까지 홀수의 합은 : " + sum);

    }
}

package PRPR.BookPR;

public class BreakExample2 {
    public static void main(String[] args) {
        //break문으로 반복문 빠져나가기
        int sum = 0;
        int num = 0;

        for (num = 0; ; num++) {
            sum += num;
            if(sum >= 100)
                break;
        }
        System.out.println("sum : " + sum);
        System.out.println("num : " + num);
    }
}

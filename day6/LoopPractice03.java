package day6;

import java.util.Scanner;

public class LoopPractice03 {
    public static void main(String[] args) {

        /*
        정수를 입력받아 합계를 구한다
        입력받은 정수가 0이면 무조건 종료한다
        for while do-while 3가지 버전으로 만들기
         */

        Scanner input = new Scanner(System.in);

        int sum = 0;

        /*
        for 사용


        for (int i = 1; ; i++) {
            System.out.printf("%d 번째 정수 입력 : ", i);
            int num1 = input.nextInt();
            sum += num1;
            if (num1 == 0) break;
        }
        System.out.printf("합계 : %d", sum);

        */


        /*

        int i = 1;
        int num;
        while (true) {
            System.out.printf("%d 번째 정수 입력 : ", i);
            int num1 = input.nextInt();
            num = num1;
            sum += num1;
            i++;
            if (num == 0) break;
        }
        System.out.printf("합계 : %d", sum);

         */

        int i = 1;
        int num;
        do {
            System.out.printf("%d 번째 정수 입력 : ", i);
            int num1 = input.nextInt();
            num = num1;
            sum += num1;
            i++;
        }
        while (num != 0);
        System.out.printf("합계 : %d", sum);



        input.close();
    }
}
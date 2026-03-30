package day6;

import java.util.Scanner;

public class LoopPractice02 {
    public static void main(String[] args) {

        /*
        정수 두 개를 입력받아 시작값과 끝값으로서 "시작값~끝값의 합계는 sum이다"를 출력
        끝값이 시작값보다 작게 입력해도
        */

        Scanner input = new Scanner(System.in);

        System.out.print("시작값을 입력해 주세요 : ");
        int start = input.nextInt();

        System.out.print("끝값을 입력해 주세요 : ");
        int finish = input.nextInt();

        input.close();


        int i;
        int sum = 0;
        int str1 = start;
        start = finish;
        int fin1 = finish;



        if (start < finish) {
            for (i =start; start <= finish; start++) {
                sum += start;
            }
            System.out.printf("%d와 %d의 합계는 %d이다", str1, finish, sum);
        } else {
            for (i = finish; start >= finish; finish++) {
                sum += finish;
            }
            System.out.printf("%d부터 %d까지의 합계는 %d이다", start, fin1, sum);
        }




        for (i = finish; start >= finish; finish++) {
            sum += finish;
        }





    }
}

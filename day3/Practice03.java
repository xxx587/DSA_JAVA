package day3;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {

        /*
        금액을 입력받아 최소 화폐 개수를 구한다.
        금액 : 67340
        5만원 : 1
        1만원 : 1
        5천원 : 1
        천원 : 2
        500원 : 0
        100원 : 3
        50원 : 0
        10원 : 4
         */

        Scanner input = new Scanner(System.in);
        System.out.print("금액 : ");
        int money = input.nextInt();

        input.close();

        int iniVal = money;

        /*
        int a5, a1, b5, b1 ,c5, c1, d5, d1;

        a5 = money / 50000;
        a1 = (money - (a5 * 50000)) / 10000;
        b5 = (money - ((a5 * 50000) + (a1 * 10000))) / 5000;
        b1 = (money - ((a5 * 50000) + (a1 * 10000) + (b5 * 5000))) / 1000;
        c5 = (money - ((a5 * 50000) + (a1 * 10000) + (b5 * 5000) + (b1 * 1000))) / 500;
        c1 = (money - ((a5 * 50000) + (a1 * 10000) + (b5 * 5000) + (b1 * 1000) + (c5 * 500))) / 100;
        d5 = (money - ((a5 * 50000) + (a1 * 10000) + (b5 * 5000) + (b1 * 1000) + (c5 * 500) + (c1 * 100))) / 50;
        d1 = (money - ((a5 * 50000) + (a1 * 10000) + (b5 * 5000) + (b1 * 1000) + (c5 * 500) + (c1 * 100) + (d5 * 50))) / 10;
        */

        int m5, m1, c5, c1, b5, b1, s5, s1, count;

        count = 0;

        m5 = money / 50000;
        count += m5;
        money %= 50000;

        m1 = money / 10000;
        count += m1;
        money %= 10000;

        c5 = money / 5000;
        count += c5;
        money %= 5000;

        c1 = money / 1000;
        count += c1;
        money %= 1000;

        b5 = money / 500;
        count += b5;
        money %= 500;

        b1 = money / 100;
        count += b1;
        money %= 100;

        s5 = money / 50;
        count += s5;
        money %= 50;

        s1 = money / 10;
        count += s1;
        money %= 10;




//        System.out.printf("50000원 : %d%n10000원 : %d%n5000원 : %d%n1000원 : %d%n500원 : %d%n100원 : %d%n50원 : %d%n10원 : %d%n", a5, a1, b5, b1, c5, c1, d5, d1);

        System.out.printf("50000원 : %d%n10000원 : %d%n5000원 : %d%n1000원 : %d%n500원 : %d%n100원 : %d%n50원 : %d%n10원 : %d%n", m5, m1, c5, c1, b5, b1, s5, s1);
        System.out.printf("%d원은 총 %d개 입니다", iniVal, count);
    }
}

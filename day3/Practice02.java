package day3;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        초 단위의 숫자를 입력받아 시간, 분, 초 단위로 환산한다
        초 단위를 입력하세요 : 3606
        1시간 0분 6초
         */
        Scanner input = new Scanner(System.in);
        System.out.print("초 단위를 입력하세요 : ");
        int sec = input.nextInt();

        input.close();

        int h, m, s;
        h = sec / 60 / 60;
        m = sec / 60 % 60;
        s = sec % 60;

        System.out.printf("%d시간 %d분 %d초", h, m, s);
    }
}

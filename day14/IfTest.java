package day14;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.in.read() > 1글자만 가능 1byte

        int n;
        System.out.print("정수 입력: ");
        n = input.nextInt();

        if (n >= 1) {
            System.out.println("양수입니다");
        } else if (n <= -1) {
            System.out.println("음수입니다");
        } else {
            System.out.println("0입니다");
        }

        switch (n) {
            case 1: System.out.println("1일때 처리"); break;
            case 2: System.out.println("2일 때 처리"); break;
            default: System.out.println("그 외의 숫자");
        }


    }
}

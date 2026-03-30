package PRPR.HR;

import java.util.Scanner;

public class Date250729HomeWork03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while(true) {

            System.out.print("첫 번쨰 정수를 입력 해 주세요 : ");
            int num1 = input.nextInt();

            System.out.print("두 번째 정수를 입력 해 주세요 : ");
            int num2 = input.nextInt();

            System.out.print("연산기호를 입력 해 주세요 : ");
            String str = input.next();
            char ch = str.charAt(0);


            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (ch == '+') {
                    System.out.printf("결과 : %d%n", num1 + num2);
                } else if (ch == '-') {
                    System.out.printf("결과 : %d%n", num1 - num2);
                } else if (ch == '*') {
                    System.out.printf("결과 : %d%n", num1 * num2);
                } else if (ch == '/') {
                    if (num2 != 0) {
                        double d = (double) num1 / num2;
                        System.out.printf("결과 : %.2f%n", d);
                    } else {
                        System.out.println("0으로 나눌 수 없습니다");
                    }
                } else {
                    System.out.println("알 수 없는 오류");
                }
            } else {
                System.out.println("지원하지 않는 연산자입니다");
                break;
            }

        }


    }
}

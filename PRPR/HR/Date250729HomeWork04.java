package PRPR.HR;

import java.util.Scanner;

public class Date250729HomeWork04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("몇 단을 출력 할 지 입력해 주세요 : ");
            int num1 = input.nextInt();

            System.out.printf("%d단 결과입니다%n", num1);


            if (num1 != 0) {
                for (int num2 = 1; num2 <= 9; num2++) {
                    System.out.printf("%d X %d = %d%n", num1, num2, num1 * num2);
                }
            } else {
                System.out.println("0을 곱하면 값은 모두 0 입니다");
                break;
            }


        }


    }
}

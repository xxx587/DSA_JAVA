package PRPR.BookPR;

import java.util.Scanner;

public class test04_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("팩토리얼 게산할숫자를 입력해 주세요 : ");
        int num = input.nextInt();
        int sum = 1;

        for (int i = 1; i <= num; i++) {
            sum *= i;
        }

        System.out.printf("%d 팩토리얼은 %d입니다", num, sum);

    }
}

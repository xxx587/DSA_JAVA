package day14;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        int sum = 0;
        for (int i = 2; i < n; i += 2) {
            sum += i;
        }
        System.out.println(sum);

    }
}

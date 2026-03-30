package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = -1, s = 0;


//        while (n != 0) {
//            System.out.print("정수 입력: ");
//            n = input.nextInt();
//            s += n;
//        }

//        do {
//            System.out.print("정수 입력: ");
//            n = input.nextInt();
//            s += n;
//        } while (n != 0);

        while (true) {
            try {
                System.out.print("정수 입력: ");
                n = input.nextInt();
            } catch (Exception e) {
                input.nextLine();
                System.out.println("정수를 입력 해 주세요");
                continue;
            }
            if (n == 0) break;
            s += n;
        }

        System.out.println("합계: " + s);

    }
}
package PRPR.BookPR;

import java.util.Scanner;

public class test04_8 {
    public static void main(String[] args) {


        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.print("성적을 입력 해 주세요 : ");
            int score1 = input.nextInt();

            if (score1 <= 100) {
                grade(score1);
            } else {
                System.out.println("100이하의 숫자만 입력 가능합니다");
                break;
            }

        }
    }

    public static void grade(int score) {
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


    }

}

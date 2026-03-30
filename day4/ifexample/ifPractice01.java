package day4.ifexample;

import java.util.Scanner;

public class ifPractice01 {
    public static void main(String[] args) {
        /*
        시험점수를 정수로 입력받습니다 (0~100점)
        합격입니다/불합격입니다 (80점 기준)
        90점 이상 A
        80점 이상 B
        70점 이상 C
        60점 이상 D
        범위를 벗어나는 입력치는 입력오류를 출력
         */

        Scanner input = new Scanner(System.in);

        System.out.print("점수를 입력해 주세요 : ");
        int score = input.nextInt();

        input.close();

        if (score >=0 && score <= 100) {
            if (score == 100 || score >= 90) {
                System.out.println("합격입니다.");
                System.out.println("90점 이상 A");
            } else if (score >= 80) {
                System.out.println("합격입니다.");
                System.out.println("80점 이상 B");
            } else if (score >= 70) {
                System.out.println("불합격입니다.");
                System.out.println("70점 이상 C");
            } else if (score >= 60) {
                System.out.println("불합격입니다.");
                System.out.println("60점 이상 D");
            } else {
                System.out.println("불합격입니다.");
            }
        } else {
            System.out.println("입력오류");
        }


    }
}

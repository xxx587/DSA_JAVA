package day4.ifexample;

import java.util.Scanner;

public class ifPractice02 {
    public static void main(String[] args) {
        //생년과 올해를 입력받기
        //1. 태어난 해가 올해잘못된 값일 경우 "태어난 해는 올해보다 이전이어야 합니다" 출력  올바른 값일 경우 몇 살 출력
        //2. 태어난 해와 올해가 홀수인지 작수인지
        //3. "태어난 해가 3의 배수이고 올해는 5의 배수가 아니다"를 출력하는 조건문을 만드세요

        Scanner input = new Scanner(System.in);

        System.out.print("태어난 연도를 입력해 주세요 : ");
        int birthYear = input.nextInt();

        System.out.print("올해 연도를 입력해 주세요 : ");
        int thisYear = input.nextInt();

        if (birthYear < thisYear) {
            System.out.println(thisYear - birthYear + 1 + "살");

            if(birthYear % 2 == 0 && thisYear % 2 == 0) {
                System.out.println("태어난 해와 올해는 짝수 연도 입니다");
            } else {
                System.out.println("태어난 해와 올해 둘 다 짝수 연도가 아닙니다");
            }

            if (birthYear % 3 == 0 && thisYear % 5 !=0) {
                System.out.println("태어난 해가 3의 배수이고 올해는 5의 배수가 아닙니다.");
            }






        } else {
            System.out.println("태어난 해는 올해보다 이전이어야 합니다");
        }


    }
}

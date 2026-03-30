package PRPR.HR;

import java.util.Scanner;

public class Date250729HomeWork01 {
    public static void main(String[] args) {
        /*
        숙제 1.
        태어난 해가 윤년이지 확인하여 결과를 출력
        4년마다 윤년, 100년마다 평년. 단, 400년마다 무조건 윤년
        2001년, 1900년 -> 평년 2004, 2000 ->윤년
        */

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("태어난 연도를 입력해 주세요 : ");
            int birthYear = input.nextInt();
            if (birthYear >= 1000) {
                if ((birthYear % 4 == 0 && birthYear % 100 != 0) || (birthYear % 400 == 0)) {
                    System.out.println("태어난 " + birthYear + "년은 윤년입니다.");
                } else {
                    System.out.println("태어난 " + birthYear + "년은 평년입니다.");
                }
            }
            else {
                System.out.println("1000년 이후부터 계산 가능합니다");
                break;
            }
        }
    }
}
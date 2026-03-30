package day3;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        1.타수와 안타수를 변수에 저장하고 타율을 계산하세요
        타수 : 10 / 안타 : 1 / 타율 :0.1
        결과예시 : 타율이 0.345로 나왔을 때 > 3할 4푼 5리
         */

        Scanner input = new Scanner(System.in);

        System.out.print("타수 : "); //println은 줄바꿈이 발생하지만 print는 발생하지 않음
        int inBase = input.nextInt();
        System.out.print("안타수 : ");
        int hit = input.nextInt();
//        int inBase = 1000;
//        int hit = 345;
        double average = (double)hit / inBase;

//        System.out.printf("타율 : %.3f%n", average);

        int hal = (int)(average * 10);
        int pun = (int)(average * 100) % 10;
        int li = (int)(average * 1000) % 10;

//        System.out.println("타율은 " + hal + "할" + pun + "푼" + li + "리 입니다.");
        System.out.printf("타수 : %d%n안타수 : %d%n타율 : %.3f%n%d할 %d푼 %d리", inBase, hit, average, hal, pun, li);

        input.close();
    }
}
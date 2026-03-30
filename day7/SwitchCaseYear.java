package day7;

import java.util.Scanner;

public class SwitchCaseYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("태어난 연도를 입력 해 주세요 : ");
        int year = input.nextInt();
        int year1 = (year - 1984) % 12;
        String[] animal = {"쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양", "원숭이", "닭", "개", "돼지"};

        switch (year1) {
            case 0 -> System.out.println(animal[0]);
            case 1 -> System.out.println(animal[1]);
            case 2 -> System.out.println(animal[2]);
            case 3 -> System.out.println(animal[3]);
            case 4 -> System.out.println(animal[4]);
            case 5 -> System.out.println(animal[5]);
            case 6 -> System.out.println(animal[6]);
            case 7 -> System.out.println(animal[7]);
            case 8 -> System.out.println(animal[8]);
            case 9 -> System.out.println(animal[9]);
            case 10 -> System.out.println(animal[10]);
            case 11 -> System.out.println(animal[11]);
        }


    }
}

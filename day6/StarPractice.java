package day6;

public class StarPractice {
    public static void main(String[] args) {

        /*
        함수
        넣는 것 : 매개변수(PARAMETER) / 인자(ARGUMENT)
        나온 것 : 반환값(RETURN)

         */




        for (int line1 = 1; line1 <= 5; line1++) {
            System.out.printf("*****%n");
        }


        System.out.println("--------------");


        for (int line2 = 1; line2 <= 5; line2++) {
            for (int star2 = 1; star2 <= line2; star2++) {
                System.out.printf("*");
            }
            System.out.println();
        }


        System.out.println("--------------");


        for (int line2 = 1; line2 <= 5; line2++) {
            for (int star2 = 5; star2 >= line2; star2--) {
                System.out.printf("*");
            }
            System.out.println();
        }


        System.out.println("--------------");



        int line4 = 5;
        for (int line5 = 0; line5 < line4; line5++) {
            for (int spaStar = 0; spaStar < (line4 - 1 - line5); spaStar++) {
                System.out.print(' ');
            }
            for (int spaStar = 0; spaStar < (2 * line5 + 1); spaStar++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

package PRPR.BookPR;

public class test04_2 {
    public static void main(String[] args) {

        int a;
        int b;

        for (a = 2; a <= 9; a++) {
            for (b = 1; b <=9; b++) {
                if (a % 2 == 1) {
                    continue;
                }
                System.out.printf("%d X %d = %d%n", a, b, a*b);
            }

        }

    }
}

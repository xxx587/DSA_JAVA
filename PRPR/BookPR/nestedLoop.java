package PRPR.BookPR;

public class nestedLoop {
    public static void main(String[] args) {

        int a;
        int b;

        for (a = 2; a <= 9; a++) {
            for (b = 1; b <= 9; b++) {
                System.out.println(a + "X" + b + "=" + a*b);
            }
        }


    }
}

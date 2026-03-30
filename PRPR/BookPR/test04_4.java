package PRPR.BookPR;

public class test04_4 {
    public static void main(String[] args) {

        int line = 4;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < (line - 1 - i); j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

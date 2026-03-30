package day6;

public class LoopPractice {
    public static void main(String[] args) {
        /*
        1 2 3 4 5 6 7 8 9 10
        0 2 4 6 8 10
        1 3 5 7 9
        10 9 8 7 6 5 4 3 2 1
        10 20 30 40 50
        2 4 8 16 32
        1 10 100 1000 10000
        */

        int i1;

        for (i1 = 0; i1 <= 10; i1++) {
            System.out.printf("%d ", i1);
        }

        System.out.println();

        int i2;

        for (i2 = 0; i2 <= 10; i2++) {
            if (i2 % 2 == 0) {
                System.out.printf("%d ", i2);
            }
            continue;
        }

        System.out.println();

        int i3;

        for (i3 = 0; i3 <= 10; i3++) {
            if (i3 % 2 == 1) {
                System.out.printf("%d ", i3);
            }
            continue;
        }

        System.out.println();

        int i4;

        for (i4 = 10; i4 >= 0; i4--) {
            System.out.printf("%d ", i4);
        }

        System.out.println();

        int i5;
        int j;

        for (i5 = 10; i5 < 11; i5++) {
            for (j = 1; j <= 5; j++) {
                System.out.printf("%d ", i5 * j);
            }
        }

        System.out.println();


        int i6;

        for (i6 = 1; i6 <= 32; i6 *= 2) {
                System.out.printf("%d ", i6);
        }

        System.out.println();

        int i7;

        for (i7 = 0; i7 <= 10000; i7 *= 10) {
            System.out.printf("%d", i7);
        }

    }
}

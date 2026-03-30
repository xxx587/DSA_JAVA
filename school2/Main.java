package school2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Management m = new Management(30);

        Scanner input = new Scanner(System.in);
        int select;

        while (true) {
            m.menu();
            select = input.nextInt();
            switch (select) {
            }

        }
    }
}

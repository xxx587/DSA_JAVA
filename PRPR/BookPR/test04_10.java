package PRPR.BookPR;

import java.util.Scanner;

public class test04_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean check = true;

        while (check) {

            System.out.print("층 수를 입력 해 주세요 : ");
            int floor = input.nextInt();
            check = Floor(floor);

        }

        input.close();

    }

    public static boolean Floor(int floor) {

        switch (floor) {
            case 1 -> {
                System.out.println("약국");
                return true;
            }
            case 2 -> {
                System.out.println("정형외과");
                return true;
            }
            case 3 -> {
                System.out.println("피부과");
                return true;
            }
            case 4 -> {
                System.out.println("치과");
                return true;
            }
            case 5 -> {
                System.out.println("헬스 클럽");
                return true;
            }
            default -> {
                System.out.println("1층부터 5층까지 있습니다");
                return false;
            }
        }

    }
}

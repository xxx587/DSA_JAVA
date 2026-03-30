package test;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            int num = (int) (Math.random() * 100 + 1);
            arr.add(num);
        }

        ArrayList<Integer> arr1 = new ArrayList<>();

        System.out.print("정수를 입력하세요 : ");
        int sel = input.nextInt();

        for (Integer number : arr) {
            if (number % sel == 0) {
                arr1.add(number);
            }
        }

        System.out.println("리스트의 내용 : " + arr);
        System.out.print(sel + "의 배수는 ");

        for (Integer number : arr1) {
            System.out.print(number + " ");
        }

        System.out.print("총 " + arr1.size() + "개 입니다.");

        input.close();
    }
}
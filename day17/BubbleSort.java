package day17;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "번째 숫자를 입력 해 주세요: ");
            arr[i] = input.nextInt();
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

package day17;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "번 정수를 입력 해 주세요: ");
            arr[i] = input.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

        Arrays.sort(arr); //정렬

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

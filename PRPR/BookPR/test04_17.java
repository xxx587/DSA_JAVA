package PRPR.BookPR;

import java.util.Scanner;

public class test04_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int num = 0; num < arr.length; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;

    }
}


/*
root
n
 */

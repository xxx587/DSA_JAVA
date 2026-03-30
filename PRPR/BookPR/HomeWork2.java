package PRPR.BookPR;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("첫 번째 피연산자 입력");
        int a = input.nextInt();
        System.out.println("두 번째 피연산자 입력");
        int b = input.nextInt();
        System.out.println("연산기호 입력");
        String operator = input.nextLine();
        double result;


        switch (operator) {
            case "+":
                result = (double) a + b;
                System.out.printf("%.2f", result);
                break;
            case "-":
                result = (double) a - b;
                System.out.printf("%.2f", result);
                break;
            case "*":
                result = (double) a * b;
                System.out.printf("%.2f", result);
            case "/":
                result = (double) a / b;
                System.out.printf("%.2f", result);

            default:
                System.out.println("지원하지 않는 연산기호");
        }

        //Scanner에는 char을 받는 기능이 없음

    }
}

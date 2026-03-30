package test;

import java.util.Scanner;

public class JavaTest1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("휴대폰 번호 입력(000-0000-0000형식) : ");
        String phoneNumber = input.nextLine();

        if (phoneNumber.length() != 13) {
            System.out.println("13자로 입력하세요.");
            input.close();
            return;
        }

        boolean isValid = true;
        boolean isFormatError = false;

        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);

            if (i == 3 || i == 8) {
                if (c != '-') {
                    isValid = false;
                    isFormatError = true;
                    break;
                }
            }

            else {
                if (!Character.isDigit(c)) {
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid) {
            System.out.println("입력한 전화번호는 " + phoneNumber + "입니다.");
        } else {
            if (isFormatError) {
                System.out.println("형식이 잘못되었습니다.");
            } else {
                System.out.println("전화번호는 숫자로 입력하세요.");
            }
        }

        input.close();
    }
}
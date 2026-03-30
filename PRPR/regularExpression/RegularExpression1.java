package PRPR.regularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("정규식 검사할 이메일 입력: ");
        String email = input.nextLine();

        String emailCheck = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z0-9]{2,6}$";

        System.out.println("정규식 검사 결과");
        System.out.println(email + " 결과: " + Pattern.matches(emailCheck, email));
    }
}

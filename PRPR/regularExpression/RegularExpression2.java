package PRPR.regularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("검사할 전화번호 입력(010-1234-5678): ");
        String phoneNum = input.nextLine();

        String phoneNumCheck = "^(010)-[0-9]{3,4}-[0-9]{4}$";

        System.out.println("정규식 검사결과");
        System.out.println(phoneNum + " 검사 결과: " + Pattern.matches(phoneNumCheck, phoneNum));
    }
}

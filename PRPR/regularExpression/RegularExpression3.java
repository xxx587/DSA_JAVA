package PRPR.regularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("검사할 URL 주소 입력: ");
        String url = input.nextLine();

        String urlCheck = "^(https://|http://)?([A-Za-z0-9]+\\.)+[A-Za-z]{2,6}$";

        System.out.println(url + "검사 결과: " + Pattern.matches(urlCheck, url));

    }
}

/*
    주민등록번호를 입력받는다. (990101-1234567 형식)
    나이와 성별, 생일을 출력한다. (26세 남자 1월 1일생)
    주민등록번호 형식을 잘못입력하면 오류메시지를 출력하고 프로그램 종료
    “000000-0000000” 형식으로 입력받는다.
    입력받은 문자열 길이는 14글자여야 한다.
    7번째 문자는 ‘-’이고, 그 외에는 숫자로 구성되어야 한다.
    8번재 문자는 성별을 의미하며 1,2,3,4 중의 한 값이어야 한다.
    월은 1~12 범위여야 한다.
    일은 1~31 범위여야 한다.
    *추가조건: 월마다 마지막 날이 다름. 태어난 해가 윤년이고 생일이 2월이면 29일까지.
 */
package day15;

import java.util.Calendar;
import java.util.Scanner;

public class StringTest5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id = null;
        char ch;
        int year, month, date;
        String name;
        String gender;
        int age;

        System.out.print("주민등록번호 입력(990101-1234567 형식):");
        id = input.nextLine();

        //글자수 확인
        if (id.length() != 14) {
            System.out.println("14자로 입력하세요.");
            return;
        }

        // -의 위치 확인
        if (id.charAt(6) != '-') {
            System.out.println("7번째 문자는 -로 입력하세요.");
            return;
        }

        //숫자로 입력했는지 확인
        for (int i = 0; i < id.length(); i++) {
            ch = id.charAt(i);
            if (i != 6 && (ch < '0' || ch > '9')) {
                System.out.println("주민등록번호는 숫자로 입력하세요.");
                return;
            }
        }

        //성별확인
        ch = id.charAt(7);
        if (ch!= '1' && ch!= '2' && ch!= '3' && ch!= '4') {
            System.out.println("성별이 잘못되었습니다.");
            return;
        }

        //생년월일
        year = Integer.parseInt(id.substring(0, 2));
        month = Integer.parseInt(id.substring(2, 4));
        date = Integer.parseInt(id.substring(4, 6));

        //월 확인
        if (month < 1 || month > 12) {
            System.out.println("월 오류");
            return;
        }

        //월별 날짜수
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //태어난 해가 윤년이면 2월이 29일까지
        if (year % 4 == 0 && year % 100!= 0 || year % 400 == 0) {
            daysInMonths[1]++;
        }

        //일 확인
        if (date < 1 || date > daysInMonths[month - 1]) {
            System.out.println("일 오류");
            return;
        }

        //나이
        if (ch == '1' || ch == '3') {
            year += 1900;
        }
        else {
            year += 2000;
        }

        Calendar cal = Calendar.getInstance();
        age   = cal.get(Calendar.YEAR) - year;

        //성별
        gender = (ch == '1')? "남자" : "여자";

        System.out.println(age + "세 " + gender + " " + month + "월 " + date + "일생");

    }
}

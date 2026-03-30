package day15;

import java.util.Calendar;
import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id;

        System.out.print("주민등록번호입력 (990101-1234567 형식): ");
        id = input.nextLine();

        if (id.length() != 14) {
            System.out.println("입력 형식이 잘못되었습니다.");
            return;
        }

        if (id.indexOf("-") != 6) {
            System.out.println("-의 위치가 잘못되었습니다.");
            return;
        }

        String[] idParts = id.split("-");

        if (!(idParts.length == 2)) {
            System.out.println("'-'이 2번 이상 입력되었습니다.");
            return;
        }

        String firstId = idParts[0];
        String lastId = idParts[1];

        try {
            Integer.parseInt(firstId);
            Integer.parseInt(lastId);
        } catch (NumberFormatException e) {
            System.out.println("주민등록번호에 숫자가 아닌 문자가 포함되어 있습니다.");
            return;
        }

        String gender;
        char genderChar = id.charAt(7);

        if (!(genderChar == '1' || genderChar == '2' || genderChar == '3' || genderChar == '4')) {
            System.out.println("성별 구분 번호(뒷자리 첫 번째 숫자)가 잘못되었습니다.");
            return;
        } else {
            if (genderChar == '1' || genderChar == '3') {
                gender = "남자";
            } else {
                gender = "여자";
            }
        }

        int idMonth = Integer.parseInt(id.substring(2, 4));

        if (!(idMonth >= 1 && idMonth <= 12)) {
            System.out.println("주민번호 앞자리(3번째~4번째 자리)가 잘못 입력되었습니다.");
            return;
        }

        int idDate = Integer.parseInt(id.substring(4, 6));
        int idYear = Integer.parseInt(id.substring(0, 2));
        int[] dateMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (idYear % 4 == 0 && idYear % 100 != 0 || idYear % 400 == 0) {
            dateMonth[1]++;
        }

        if (idDate < 1 || idDate > dateMonth[idMonth - 1]) {
            System.out.println("주민번호 앞자리(5번째~6번째 자리)가 잘못 입력되었습니다.");
            return;
        }

        if (genderChar == '1' || genderChar == '2') {
            idYear += 1900;
        } else {
            idYear += 2000;
        }

        Calendar cal = Calendar.getInstance();
        int age = cal.get(Calendar.YEAR) - idYear + 1;

        if (idYear > cal.get(Calendar.YEAR)) {
            System.out.println("태어난 연도는 현재 연도보다 나중일 수 없습니다.");
            return;
        }


        System.out.printf("%s년생 %d월 %d일 태어난 %d살 %s입니다.", id.substring(0, 2), idMonth, idDate, age, gender);
    }
}
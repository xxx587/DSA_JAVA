package day16;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringTest1 {
    public static void main(String[] args) {
        Calendar now;

        for (int i = 0; i <= 10; i++) {
            now = Calendar.getInstance();
//            SimpleDateFormat format = new SimpleDateFormat("yyyy년 M월 dd일 hh시 mm분 ss초");
//            String formatDate = format.format(now.getTime());
//            System.out.println(formatDate);
            int year = now.get(Calendar.YEAR);
            int month = now.get(Calendar.MONTH);
            int date = now.get(Calendar.DATE);
            int hour = now.get(Calendar.HOUR);
            int minute = now.get(Calendar.MINUTE);
            int sec = now.get(Calendar.SECOND);
            System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초%n", year, month, date, hour, minute, sec);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception");
                ;
            }
        }

        String filename = "이력서_홍길동.250824.docx";
        int whereDot = filename.lastIndexOf(".");

        if (whereDot != -1) {
            String dotStart = filename.substring(whereDot + 1);
            System.out.println("확장자는 " + dotStart + "입니다.");
        } else {
            System.out.println("확장자가 없습니다.");
        }

        String phone = "010-1111-2222";
        String[] phoneArr = phone.split("-");
        for (int i = 0; i < phoneArr.length; i++) {
            if (i < phoneArr.length - 1) {
                System.out.print(phoneArr[i] + ".");
            } else {
                System.out.println(phoneArr[i]);
            }
        }


    }
}
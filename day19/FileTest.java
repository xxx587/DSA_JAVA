package day19;

import java.io.FileWriter;
import java.io.IOException;

//문자 단위 파일 출력
public class FileTest {
    public static void main(String[] args) {
        FileWriter out = null;

        try {
            out = new FileWriter("c:\\test\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일 생성 실패");
            return;
        }

        try {
            out.write("A");
            out.write("\n");
            out.write("가");
        } catch (IOException e) {
            System.out.println("쓰기 오류");
        }

        try {
            out.close();
        } catch (IOException e) {
            System.out.println("스트림 닫기 오류");
        }

    }
}

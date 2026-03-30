package day19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTest3 {
    public static void main(String[] args) {

        FileReader in = null;
        int ch;

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("파일 주소 입력: ");
            in = new FileReader(input.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다");
            return;
        }

        try {
            while (true) {
                ch = in.read();
                if (ch == -1) break;
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("read IOException");
            return;
        }

        try {
            in.close();
        } catch (IOException e) {
            System.out.println("close IOException");
        }


    }
}

/*
파일명 입력 :
import java.util.*;
...

[실행2] 없는 경우
파일명 입력 :
파일이 없습니다.

return; > 메서드 종료
System.exit(0); > 시스템 종료
 */
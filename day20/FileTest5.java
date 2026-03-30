package day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest5 {
    public static void main(String[] args) {

        String filename;
        File file = null;
        String content;


        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.print("파일명 입력: ");
                filename = input.nextLine();

                file = new File(filename + ".txt");

                if (file.exists()) {
                    System.out.print("파일 덮어쓰기 (Y/N): ");
                    String write = input.nextLine();

                    if (write.equalsIgnoreCase("Y")) {
                    } else if (write.equalsIgnoreCase("N")) {
                        System.out.println("새 파일명을 입력");
                        continue;
                    } else {
                        System.out.println("잘못입력됨");
                        continue;
                    }
                }
                System.out.println("===파일 작성===");

                try (BufferedWriter out = new BufferedWriter(new FileWriter(file));) {
                    while (true) {
                        content = input.nextLine();

                        if (content.isEmpty()) {
                            break;
                        }

                        out.write(content);
                        out.newLine();
                    }
                    System.out.println("'" + file.getName() + "' 파일 저장 완료");
                    return;
                } catch (IOException e) {
                    System.out.println("에러");
                    return;
                }
            }
        }
    }
}
/*
파일명으로 file객체생성
이미 사용중인 이름인지 확인
있으면 덮어쓸지 여부 확인
n 입력하면 새로 파일명 입력받기
입력받은 이름으로 파일 생성
반복적으로 내용 입력받아 파일에 저장
새로운 행에서 엔터치면 종료
 */



/*
sout 내용 입력. 종료는 새로운 행에서 엔터키.
1: abc
2: ㅁㄴㅇ
3: 123
4:
저장하시겠습니까? (Y/N) y
파일명을 입력하세요: test
test.txt 파일이 생성되었습니다

==========

1. String을 이어붙인다.
2. StringBuffer에 모아놓는다 >> toString()으로 String으로 변환해서 저장
3. String들을 ArrayList에 저장 >> 반복문으로 String들을 꺼내서 저장
4. 임시 파일을 만들어 저장 >> 저장 여부에 따라 삭제하거나 이름을 바꿈
 */
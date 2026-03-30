package day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileTest6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String line;
            ArrayList<String> list = new ArrayList<>();

            System.out.println("== 내용 입력(종료는 빈 줄로 Enter) ==");

            while (true) {
                line = input.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                list.add(line);
            }


            while (true) {
                System.out.print("저장여부 (Y/N): ");
                String save = input.nextLine();

                if (save.equalsIgnoreCase("Y")) {

                    while (true) {
                        System.out.print("파일명 입력: ");
                        String name = input.nextLine();
                        File file = new File(name + ".txt");

                        if (file.exists()) {
                            System.out.print("덮어쓰기? (Y/N): ");
                            String overwrite = input.nextLine();

                            if (overwrite.equalsIgnoreCase("Y")) {
                            } else if (overwrite.equalsIgnoreCase("N")) {
                                System.out.println("새 파일명 입력");
                                continue;
                            } else {
                                System.out.println("잘못 입력함");
                                continue;
                            }
                        }

                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                            for (String content : list) {
                                writer.write(content);
                                writer.newLine();
                            }
                            writer.close();
                            System.out.println("저장완료");
                            break;
                        } catch (IOException e) {
                            System.out.println("Exception");
                            break;
                        }
                    }
                    break;

                } else if (save.equalsIgnoreCase("N")) {
                    System.out.println("저장안함");
                    break;

                } else {
                    System.out.println("Y/N 입력안함");
                }
            }
        }
    }
}

/*
내용 입력. 종료는 새로운 행에서 엔터키.
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
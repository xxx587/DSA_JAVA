package day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileTest9 {
    public static void main(String[] args) {
        File tempFile = null;

        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> list = new ArrayList<>();

            try {
                tempFile = File.createTempFile("temp", ".txt");
                tempFile.deleteOnExit();
                System.out.println("임시 파일 생성 성공");
            } catch (IOException e) {
                System.out.println("임시 파일 생성 실패");
                return;
            }

            System.out.println("== 내용 입력(종료는 빈 줄로 Enter) ==");
            while (true) {
                String line = input.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                list.add(line);
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
                for (String content : list) {
                    writer.write(content);
                    writer.newLine();
                }
            } catch (IOException e) {
                System.out.println("임시파일 내용쓰기 오류");
            }


            while (true) {
                System.out.print("내용 저장? (Y/N): ");
                String save = input.nextLine();

                if (save.equalsIgnoreCase("Y")) {
                    while (true) {
                        System.out.print("저장할 파일명 입력: ");
                        String name = input.nextLine();
                        if (name.trim().isEmpty()) {
                            System.out.println("파일 이름은 공백일 수 없음");
                            continue;
                        }

                        File finalFile = new File(name + ".txt");

                        if (finalFile.exists()) {
                            System.out.print("덮어쓰기? (Y/N): ");
                            String overwrite = input.nextLine();

                            if (overwrite.equalsIgnoreCase("Y")) {
                                if (!finalFile.delete()) {
                                    System.out.println("기존파일 삭제 실패");
                                    continue;
                                }
                            } else {
                                System.out.println("새 파일명을 입력");
                                continue;
                            }
                        }

                        if (tempFile.renameTo(finalFile)) {
                            System.out.println("저장완료");
                            break;
                        } else {
                            System.out.println("저장실패");
                        }
                    }
                    break;

                } else if (save.equalsIgnoreCase("N")) {
                    System.out.println("저장안함");
                    break;

                } else {
                    System.out.println("Y/N으로만 입력");
                }
            }
        }
    }
}
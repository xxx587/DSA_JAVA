package day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String line;
            //String fullContent = "";
            StringBuilder build = new StringBuilder(); //효율 측면에서는 +=보다 StringBuilder가 더 좋다

            System.out.println("== 내용 입력(종료는 빈 줄로 Enter) ==");

            while (true) {
                line = input.nextLine();
                if (line.isEmpty()) {
                    break;
                }

                //fullContent += line + "\n";
                build.append(line).append("\n");
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
                            //writer.write(fullContent);
                            writer.write(build.toString());
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
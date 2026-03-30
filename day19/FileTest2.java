package day19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        FileReader in = null;
        int ch;


        try {
            in = new FileReader("c:\\test\\a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다");
        }

        try {
            while (true) {
                ch = in.read();
                if (ch == -1) break;
                System.out.println(ch);
            }

//            while ((ch = in.read()) != 1) {
//                System.out.println((char) ch);
//            }

        } catch (IOException e) {
            System.out.println("IOException");
        }

        try {
            in.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}

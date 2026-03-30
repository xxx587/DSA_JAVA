package day15;

import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        try {
        int i = System.in.read();
        System.out.println((char) i);
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}

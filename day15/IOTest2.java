package day15;

import java.io.IOException;

public class IOTest2 {
    public static void main(String[] args) {
        try {
            sub();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sub() throws  IOException{
        int i = System.in.read();
        System.out.println((char) i);
    } // IOException을 여기서 throws하면 받는 곳에서 예외 처리를 해 줘야함
}
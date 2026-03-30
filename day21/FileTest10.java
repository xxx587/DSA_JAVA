package day21;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileTest10 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.dat")); //확장자는 아무거나 적어도 됨 하지만 다른 프로그램은 못읽음

        out.writeObject(new Student("aaa", 100, 90,80));
        out.writeObject(new Student("bbb", 90, 80,70));
        out.writeObject(new Student("ccc", 80, 70,60));
        out.close();
    }
}

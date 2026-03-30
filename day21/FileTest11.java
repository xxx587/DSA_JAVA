package day21;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class FileTest11 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.dat")); //object 읽기
        Student s = null;

        while (true) {
            try {
                s = (Student) in.readObject(); //object타입으로 가져오기 때문에 형변환을 해줌
                System.out.println(s);
            } catch (EOFException e) {
                break;
            }
            in.close();
        }

    }


}


package day21;

import java.io.*;
import java.util.ArrayList;

public class StudentFile {
    final File file = new File("./src/day21/12");
    ArrayList<Student> studentList;
    ObjectInputStream in;
    ObjectOutputStream out;
    int num;

    public StudentFile() {
        try {
            in = new ObjectInputStream(new FileInputStream(file));
            studentList = (ArrayList<Student>) in.readObject();
            num = (Integer) in.readObject();
            in.close();
        } catch (IOException e) {
            studentList = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound Exception");
        }
    }

    public void outStr() {
        try {
            out = new ObjectOutputStream(new FileOutputStream(file));
            Integer number = num;
            out.writeObject(number);
            out.writeObject(studentList);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}


package day20;

import java.io.File;

public class FileTest4 {
    public static void main(String[] args) throws Exception{
        File a = new File("a.txt"); //없는 파일
        File b = new File("c:\\PR"); //있는 디렉토리
        File c = new File("."); //현재 디렉토리 (..은 1단계 상위 폴더)
        File d = new File("sub"); //없는 디렉토리
        File e = new File("C:\\Java-busan-12th\\java-basic\\src\\day2\\DataType.java"); //있는 파일

        /*
        System.out.println(a.exists()); //f
        System.out.println(a.isFile()); //f
        System.out.println(a.isDirectory()); //f
        System.out.println(b.exists()); //t
        System.out.println(b.isFile()); //f
        System.out.println(b.isDirectory()); //t
        System.out.println(c.exists()); //t
        System.out.println(c.isFile()); //f
        System.out.println(c.isDirectory()); //t
        System.out.println(d.exists()); //f
        System.out.println(d.isFile()); //f
        System.out.println(d.isDirectory()); //f
        System.out.println(e.exists()); //t
        System.out.println(e.isFile()); //t
        System.out.println(e.isDirectory()); //f
        System.out.println(e.getAbsolutePath()); //C:\Java-busan-12th\java-basic\src\day2\DataType.java
        System.out.println(e.getCanonicalPath()); //C:\Java-busan-12th\java-basic\src\day2\DataType.java
        System.out.println(e.getName()); //DataType.java
        System.out.println(e.length()); //3492

        if (!a.isFile()) {
            a.createNewFile(); //파일 생성
        }

        if (!d.isDirectory()) {
            d.mkdir(); //폴더 생성
        }

        a.delete(); //파일 삭제
        */

        


    }
}

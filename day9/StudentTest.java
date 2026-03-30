package day9;

//다른 패키지에 있는 클래스를 가져다 쓸 수 있음(import 키워드 필요)
import day8.kitchen.Ramen;
//Scanner도 import
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

//        Student seo = new Student();
//        Scanner sc = new Scanner(System.in);
//        seo.setStudentID(123456);
//        seo.studentName = "서희연";

        Student kim = new Student(456789, "김민서", 1, "부산광역시 중구 무역회관");

        kim.setStudentID(12344);
        System.out.println(kim.studentName + " 님의 학번은 : " + kim.getStudentID());


        System.out.println(kim.getStudentID());
        System.out.println(kim.studentName);
        System.out.println(kim); //리모컨 → 참조값, 주소값
        kim.greet();


        Ramen ram = new Ramen();
        day8.Student stu= new day8.Student(); //다른 패키지의 같은 이름의 클래스를 가져오면 패키지 이름도 포함됨. 같은 패키지에 같은 클래스명은 오류
        stu.name = "김석현";


    }
}

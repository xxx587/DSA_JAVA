package day8;

public class StudentTest {
    public static void main(String[] args) {

        Student kim = new Student();
        kim.name = "김지우";
        kim.math = 90;
        kim.eng = 87;
        kim.kor = 87;
        kim.phone = "010-1234-5678";
        System.out.println(kim.name);
        kim.goSchool();

        /*
        static이 없는 건 객체로 호출해야함
        static을 사용하면 객체를 생성하지 않아도 부를 수 있는 기능이 됨
        new 키워드로 실체 생성 > kim에 담아놓음 > 실체를 가지게 됨 > 동작을 할 수 있게 됨
         */
    }
}

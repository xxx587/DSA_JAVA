package day11;

public class StudentTest {

    public static void main(String[] args) {
        System.out.println(Student.getSerialNum()); //static은 기울임체로 적힘
        Student seo = new Student("서희연", 87);
        Student seo2 = new Student("서희민", 98);
        Student kim = new Student("김태원", 95);

        System.out.println(seo);
        System.out.println(seo2);
//        System.out.println(Student.serialNum);





    }
//
//    private Student student1 = {
//            new Student("서희연"),
//            new Student("서희민"),
//            new Student("김태원")
//    };
//
//    public Student[] getStudents() {
//        return this.student1;
//    }
//

}

package day9;

public class Student {

    //필드 : 객체의 상태
    private int studentID;
    String studentName;
    int grade;
    String address;

    //사용자 정의 생성자
    Student(int studentID, String studentName, int grade, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
        this.address = address;
    }

    /*
    디폴트 생성자
     */
//    Student() {
//
//    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    //매서드 : 객체가 할 수 있는 것, 동작
    void greet() {
        System.out.println(studentName + "님이 인사를 합니다 : 안녕하세요");
    }

}
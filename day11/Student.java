package day11;

public class Student {

    private static int serialNum = 1000; //정적 변수, 클래스에 속해 있음
    int studentId;
    String name;
    int grade;
    //학생이 가지고 있어야 할 정보

    public Student(String name, int grade) { //인스턴스 변수 - 생성자 - 인스턴스 반환
        serialNum++;
        this.studentId = serialNum;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void setSerialNum(int serialNum) { //인스턴스를 참조하지 않아도 알 수 있음
        Student.serialNum = serialNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }





}

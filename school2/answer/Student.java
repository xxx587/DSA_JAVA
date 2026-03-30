package school2.answer;

public class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString()+"저는 학생입니다 \n" +
                "학번은" + studentId +
                "입니다\n";
    }
}

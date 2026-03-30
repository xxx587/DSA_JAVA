package school2;

public class Structure2 extends Structure1 {

    private int studentId;

    public Structure2(String name, int age, int studentId) {
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
        return super.toString() + "학번: " + studentId +
                "\n";
    }
}
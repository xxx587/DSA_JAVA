package school2.answer;

public class Teacher extends Person {
    // 과목
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString()+"저는 선생입니다 \n" +
                "담당과목은 " + subject +
                " 입니다\n";
    }
}

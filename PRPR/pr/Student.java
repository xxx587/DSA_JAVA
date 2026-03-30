package PRPR.pr;

public class Student {

    static int serialNum = 1;
    int studentId = serialNum;
    String name;
    int math;
    int kor;
    int eng;
    double avg;
    String grade;

    public Student(String name, int math, int kor, int eng) {
        this.studentId = serialNum++;
        this.name = name;
        this.math = math;
        this.kor = kor;
        this.eng = eng;
        this.avg = (double) (math + kor + eng) / 3;
        this.grade = grades(this.avg);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String grades(double avg) {
        if (avg >= 90) {
            return "A등급";
        } else if (avg >= 80) {
            return "B등급";
        } else if (avg >= 70) {
            return "C등급";
        } else if (avg >= 60) {
            return "D등급";
        } else {
            return "F등급";
        }
    }

    @Override
    public String toString() {
        return "학생 정보" +
                "\n학번: " + studentId +
                "\n이름: " + name +
                "\n수학: " + math +
                "\n국어: " + kor +
                "\n영어: " + eng +
                "\n평균: " + avg +
                "\n학점: " + grade;
    }
}
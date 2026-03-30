package day7;

public class Students {

    static int serialNum = 1;
    int studentId = serialNum;
    private String name;
    int kor;
    int math;
    int eng;
    double avg;
    String grade;

    public Students(String name, int kor, int eng, int math) {
        this.studentId = serialNum++;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.avg = (kor + eng + math) / 3.0;
        this.grade = grades(this.avg);
    }

    public String grades (double avg) {
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

    private void updateAvgAndGrade() {
        this.avg = (this.kor + this.eng + this.math) / 3.0;
        this.grade = grades(this.avg);
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Students.serialNum = serialNum;
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

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
        updateAvgAndGrade();
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
        updateAvgAndGrade();
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        updateAvgAndGrade();
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }





    @Override
    public String toString() {
        return "학생 정보\n" +
                "학번: " + studentId +
                "\n이름: '" + name + '\'' +
                "\n국어: " + kor +
                "\n수학: " + math +
                "\n영어: " + eng +
                "\n평균: " + avg +
                "\n등급: " + grades(avg);
    }
}



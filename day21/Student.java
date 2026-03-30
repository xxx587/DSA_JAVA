package day21;

import java.io.Serializable;

//추상 메서드는 오버라이딩을 하거나 해당 클래스도 추상 메서드여야 함
public class Student implements Comparable<Student>, Serializable {
    //멤버변수
    private int num;
    private String name;
    private int kor;
    private int math;
    private int eng;
    private int total;

    //메서드
    public Student(String name, int kor, int math, int eng) {
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.total = this.kor + this.math + this.eng;
    }

    public Student(int num, String name, int kor, int math, int eng) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.total = this.kor + this.math + this.eng;
    }

    public Student() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "번호: " + num +
                "\n이름: " + name +
                "\n국어: " + kor +
                "\n수학: " + math +
                "\n영어: " + eng +
                "\n총점: " + total;
    }

    @Override
    public int compareTo(Student o) {
        return this.getNum() - o.getNum();
    } //비교 대상 지정 -,0,+ 로 비교 >> -1을 곱하면 내림차순으로 정렬됨




}
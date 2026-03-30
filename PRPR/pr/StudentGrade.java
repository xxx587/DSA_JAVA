package PRPR.pr;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int arrNum = 0;
        Student StudentArr[] = new Student[arrNum];

        System.out.print("학생 수를 입력 해 주세요: ");
        arrNum = input.nextInt();

        StudentArr = new Student[arrNum];

        for (int i = 0; i < arrNum; i++) {
            input.nextLine();
            System.out.print("이름을 입력 해 주세요: ");
            String name = input.nextLine();

            System.out.print("수학 성적을 입력 해 주세요: ");
            int math = input.nextInt();

            System.out.print("국어 성적을 입력 해 주세요: ");
            int kor = input.nextInt();

            System.out.print("영어 성적을 입력 해 주세요: ");
            int eng = input.nextInt();

            StudentArr[i] = new Student(name, math, kor, eng);
        }


        for (Student student : StudentArr) {
            if (student != null) {
                System.out.printf("학번: %d%n이름: %s%n수학: %d%n국어: %d%n영어: %d%n평균: %.2f%n등급: %s%n", student.getStudentId(), student.getName(), student.getMath(), student.getKor(), student.getEng(), student.getAvg(), student.getGrade());
            }
        }


        System.out.print("보기 원하는 학생 번호를 입력 해 주세요: ");
        int studentNum = input.nextInt();
        System.out.println(StudentArr[studentNum - 1]);


    }
}

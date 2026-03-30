package day7;

import day7.Students;

import java.util.Scanner;

public class multyple {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int studentNum = 0;
        Students[] studentsArr = new Students[studentNum];

        while (true) {

            System.out.println("원하는 숫자를 입력 해 주세요");
            System.out.printf("1.학생 정보 입력%n2.모든 학생 정보 출력%n3.원하는 학생 정보 출력%n4.원하는 학생 정보 수정%n5.정보를 삭제할 학생 입력%n이외의 번호: 종료하기%n입력: ");
            int select = input.nextInt();
            switch (select) {
                case 1 -> {
                    System.out.print("학생이 몇 명인지 입력 해 주세요 :");
                    studentNum = input.nextInt();
                    input.nextLine();
                    studentsArr = new Students[studentNum];
                    for (int i = 0; i < studentNum; i++) {
                        System.out.println("--- " + (i + 1) + "번째 학생 정보 입력 ---");

                        System.out.print("이름: ");
                        String name = input.nextLine();

                        System.out.print("국어 점수: ");
                        int kor = input.nextInt();

                        System.out.print("영어 점수: ");
                        int eng = input.nextInt();

                        System.out.print("수학 점수: ");
                        int math = input.nextInt();
                        input.nextLine();

                        studentsArr[i] = new Students(name, kor, eng, math);
                    }
                }
                case 2 -> {
                    System.out.println("--- 학생 명단 ---");
                    for (Students student : studentsArr) {
                        if (student != null) {
                            System.out.printf("학번: %d%n이름: %s%n국어: %d%n영어: %d%n수학: %d%n평균: %.2f%n등급: %s%n",
                                    student.getStudentId(), student.getName(), student.getKor(),
                                    student.getEng(), student.getMath(), student.getAvg(),
                                    student.grades(student.getAvg()));
                            System.out.println("----------------------");
                        }
                    }
                }
                case 3 -> {
                    System.out.print("보기 원하는 학생 번호를 입력 해 주세요: ");
                    int stNum = input.nextInt();
                    input.nextLine();
                    System.out.println(studentsArr[stNum - 1]);
                }
                case 4 -> {
                    System.out.print("정보를 수정 할 학생 번호를 입력해 주세요: ");
                    int stNum = input.nextInt();
                    input.nextLine();

                    Students studentToUpdate = studentsArr[stNum - 1];

                    System.out.print("이름: ");
                    String name = input.nextLine();
                    studentToUpdate.setName(name);

                    System.out.print("국어 점수: ");
                    int kor = input.nextInt();
                    studentToUpdate.setKor(kor);

                    System.out.print("영어 점수: ");
                    int eng = input.nextInt();
                    studentToUpdate.setEng(eng);

                    System.out.print("수학 점수: ");
                    int math = input.nextInt();
                    studentToUpdate.setMath(math);

                    double newAvg = (studentToUpdate.getKor() + studentToUpdate.getEng() + studentToUpdate.getMath()) / 3.0;
                    studentToUpdate.setAvg(newAvg);
                }
                case 5 -> {
                    System.out.println("정보를 삭제할 학생 번호를 입력해 주세요");
                    int stNum = input.nextInt();
                    studentsArr[stNum - 1] = null;
                }
                default -> {
                    return;
                }


            }
        }


        /*
        ---학생정보관리---
        정보입력
        학생 정보 출력
        학생 정보 수정
        정보수정
        정보삭제
         */
    }


}

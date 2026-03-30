package day18;

import day21.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = "abc";
        String b = "add";
        System.out.println(a.compareTo(b));

        Student student = new Student("홍길동", 100, 90, 80);
        Student student2 = new Student();

        int k = student.getKor();
        student.setEng(100);
        int t = student.getTotal();

        System.out.println(student);

        ArrayList<Student> slist = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("학생 이름: ");
            String name= input.nextLine();

            try {
                System.out.print("국어 점수: ");
                int kor = input.nextInt();
                System.out.print("수학 점수: ");
                int math = input.nextInt();
                System.out.print("영어 점수: ");
                int eng = input.nextInt();
                input.nextLine();

                student = new Student(name, kor, math, eng);
                slist.add(student);
                Collections.sort(slist);
            } catch (InputMismatchException e) {
                System.out.println("점수에 숫자가 아닌 값이 입력되엇습니다.");
                return;
            }

        }
        input.close();
        System.out.println(slist);

    }
}

/*
이름: 홍길동 국어: 100점 수학: 90점 영어:80점
한 학생의 이름, 국영수 점수 입력받아 그 객체를 리스트에 저장
Serializable > 파일 저장하고 읽기 / Comparable<String> > 비교 대상 지정(정렬을 위해)
 */

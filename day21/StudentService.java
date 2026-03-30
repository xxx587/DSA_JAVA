package day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentService {
    private final ArrayList<Student> studentArr = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);
    private int nextStuNum = 1;

    public boolean check(int a) {
        String scoreChk = "^([1-9]?[1-9]|100)$";
        String strA = String.valueOf(a);
        boolean ch = Pattern.matches(scoreChk, strA);
        if (ch) {
            return true;
        }
        return false;
    }

    public boolean nameChk(String a) {
        String nameChk = "^[A-Za-z가-힇]{1,}$";
        if (Pattern.matches(nameChk, a)) {
            return true;
        }
        return false;
    }

    public void addStudent() {
        System.out.println(">> 1. 학생 정보 입력 <<");
        try {
            System.out.print("학생 이름: ");
            String name = input.nextLine();
            if (!nameChk(name)) {
                System.out.println("이름은 영문 대/소문자, 한글이 최소한 1번은 입력되어야 합니다.");
                return;
            }

            System.out.print("국어 성적: ");
            int kor = input.nextInt();
            if (!check(kor)) {
                System.out.println("0-100까지의 숫자만 입력이 가능합니다.");
                return;
            }

            System.out.print("수학 성적: ");
            int math = input.nextInt();
            if (!check(math)) {
                System.out.println("0-100까지의 숫자만 입력이 가능합니다.");
                return;
            }

            System.out.print("영어 성적: ");
            int eng = input.nextInt();
            input.nextLine();
            if (!check(eng)) {
                System.out.println("0-100까지의 숫자만 입력이 가능합니다.");
                return;
            }

            studentArr.add(new Student(nextStuNum++, name, kor, math, eng));
            System.out.println("학생 정보가 성공적으로 입력되었습니다.");
            Collections.sort(studentArr);

        } catch (InputMismatchException e) {
            System.out.println("성적은 숫자로만 입력해야 합니다.");
            input.nextLine();
        }
    }

    public void updateStudent() {
        System.out.println(">> 2. 학생 정보 수정 <<");
        System.out.print("수정할 학생의 번호를 입력하세요: ");
        try {
            int targetNum = input.nextInt();
            input.nextLine();

            Student studentToUpdate = findStudent(targetNum);

            if (studentToUpdate == null) {
                System.out.println("해당 번호의 학생을 찾을 수 없습니다.");
                return;
            }

            System.out.println(">> 수정할 학생 정보 <<");
            System.out.println(studentToUpdate);
            System.out.println("--------------------");

            System.out.print("새 이름: ");
            String n = input.nextLine();
            if (!nameChk(n)) {
                System.out.println("이름은 영문 대/소문자, 한글이 최소한 1번은 입력되어야 합니다.");
                return;
            }

            System.out.print("새 국어 성적: ");
            int k = input.nextInt();
            if (!check(k)) {
                System.out.println("0-100까지의 숫자만 입력이 가능합니다.");
                return;
            }

            System.out.print("새 수학 성적: ");
            int m = input.nextInt();
            if (!check(m)) {
                System.out.println("0-100까지의 숫자만 입력이 가능합니다.");
                return;
            }

            System.out.print("새 영어 성적: ");
            int e = input.nextInt();
            input.nextLine();
            if (!check(e)) {
                System.out.println("0-100까지의 숫자만 입력이 가능합니다.");
                return;
            }

            studentToUpdate.setName(n);
            studentToUpdate.setKor(k);
            studentToUpdate.setMath(m);
            studentToUpdate.setEng(e);

            System.out.println("학생 정보가 성공적으로 수정되었습니다.");

        } catch (InputMismatchException e) {
            System.out.println("번호나 성적은 숫자로 입력해야 합니다.");
            input.nextLine();
        }
    }

    public void searchStudent() {
        System.out.println(">> 3. 학생 정보 검색 <<");

        System.out.printf("1.번호로 검색하기%n2.이름으로 검색하기%n> ");
        int sel = input.nextInt();
        input.nextLine();

        switch (sel) {

            case 1 -> {
                System.out.print("검색할 학생의 번호를 입력하세요: ");

                try {
                    int targetNum = input.nextInt();
                    input.nextLine();

                    Student foundStudent = findStudent(targetNum);

                    if (foundStudent != null) {
                        System.out.println(">> 검색 결과 <<");
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("해당 번호의 학생을 찾을 수 없습니다.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("학생 번호는 숫자로 입력해야 합니다.");
                    input.nextLine();
                }
            }

            case 2 -> {
                System.out.print("검색할 학생의 이름을 입력하세요: ");

                String targetName = input.nextLine();
                Student foundStudent = findStudent(targetName);

                if (foundStudent != null) {
                    System.out.println(">> 검색 결과 <<");
                    System.out.println(foundStudent);
                } else {
                    System.out.println("해당 이름의 학생을 찾을 수 없습니다.");
                }

            }

            default -> System.out.println("숫자가 잘못 입력되었습니다.");

        }
    }

    public void printAllStudents() {
        System.out.println(">> 4. 전체 학생 출력 <<");
        if (studentArr.isEmpty()) {
            System.out.println("등록된 학생 정보가 없습니다.");
            return;
        }

        for (Student s : studentArr) {
            System.out.println(s);
            System.out.println("--------------------");
        }
    }

    public void deleteStudent() {
        System.out.println(">> 5. 학생 정보 삭제 <<");
        System.out.print("삭제할 학생의 번호를 입력하세요: ");
        try {
            int targetNum = input.nextInt();
            input.nextLine();

            Student studentToDelete = findStudent(targetNum);

            if (studentToDelete == null) {
                System.out.println("해당 번호의 학생을 찾을 수 없습니다.");
                return;
            }

            studentArr.remove(studentToDelete);
            System.out.println(targetNum + "번 학생 정보가 삭제되었습니다.");

        } catch (InputMismatchException e) {
            System.out.println("학생 번호는 숫자로 입력해야 합니다.");
            input.nextLine();
        }
    }

    public void rank() {

    }





    public Student findStudent(int stuNum) {
        for (Student student : studentArr) {
            if (student.getNum() == stuNum) {
                return student;
            }
        }
        return null;
    }

    public Student findStudent(String stuName) {
        for (Student student : studentArr) {
            if (student.getName().contains(stuName)) {
                return student;
            }
        }
        return null;
    }


}
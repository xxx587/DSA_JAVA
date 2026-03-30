package day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentManagement management = new StudentManagement();
        StudentService service = new StudentService();
        StudentFile save = new StudentFile();
        int select;


        while (true) {
            management.menu();

            try {
                select = input.nextInt();
                input.nextLine();

                switch (select) {
                    case 1 -> {
                        System.out.println("1번 입력메뉴 선택했습니다.");
                        service.addStudent();
                    }
                    case 2 -> {
                        System.out.println("2번 입력메뉴 선택했습니다.");
                        service.updateStudent();
                    }
                    case 3 -> {
                        System.out.println("3번 입력메뉴 선택했습니다.");
                        service.searchStudent();
                    }
                    case 4 -> {
                        System.out.println("4번 입력메뉴 선택했습니다.");
                        service.printAllStudents();
                    }
                    case 5 -> {
                        System.out.println("5번 입력메뉴 선택했습니다.");
                        service.deleteStudent();
                    }
//                    case 6 -> {
//                        System.out.println("6번 입력메뉴 선택했습니다.");
//                        service.rank();
//                    }
                    
                    case 0 -> {
                        System.out.println("프로그램을 종료합니다.");
                        save.outStr();
                        return;
                    }
                    default -> System.out.println("번호 입력 오류 다시 입력하세요");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자가 아닌 것을 입력했습니다");
                input.nextLine();
            }
        }

    }

    void menu() {
        System.out.println("=====[학생 관리 시스템]=====");
        System.out.printf("1.입력%n2.수정%n3.검색%n4.전체 출력%n5.삭제%n0.종료%n");
        System.out.println("=========================");
        System.out.print("선택 > ");
    }
}
/*
    [학생 관리 시스템]
    1.입력
    2.수정
    3.검색
    4.전체 출력
    5.삭제
    6.전체 등수
    0.종료

    선택 > (번호 잘못 입력 시 재출력해서 입력 대기)
    선택 > n >>> n번 입력메뉴 선택했습니다
    선택 > 0 >>> 프로그램을 종료합니다.

 */
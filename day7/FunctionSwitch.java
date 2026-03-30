package day7;

import day11.StudentTest;

import java.util.Scanner;

public class FunctionSwitch {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {




        while (true) {

            Print();
            System.out.printf("원하는 기능을 선택해 주세요 : ");
            int select = input.nextInt();

            switch (select) {
                case 0 -> {
                    return;
                }
                case 1 -> Year(input);
                case 2 -> Bmi(input);
                case 3 -> Cal(input);
                case 4 -> Gugu(input);
                case 5 -> Sum(input);
                case 6 -> Old(input);
                case 7 -> Result(input);
                default -> System.out.println("해당하는 숫자를 입력 해 주세요");
            }
        }
    }

    public static void Print() {
        System.out.printf("%n0.종료하기%n1.윤년 계산기%n2.bmi 계산기%n3.사칙연산 계산기%n4.구구단 출력기%n5.누산값 계산기%n6.나이계산기%n7.성적출력기%n");
    }

    public static void Year(Scanner input) {

        System.out.print("태어난 연도를 입력해 주세요 : ");
        int birthYear = input.nextInt();
        if (birthYear >= 1000) {
            if ((birthYear % 4 == 0 && birthYear % 100 != 0) || (birthYear % 400 == 0)) {
                System.out.println("태어난 " + birthYear + "년은 윤년입니다.");
            } else {
                System.out.println("태어난 " + birthYear + "년은 평년입니다.");
            }
        } else {
            System.out.println("1000년 이후부터 계산 가능합니다");
        }
    }

    public static void Bmi(Scanner input) {

        System.out.print("몸무게를 입력하세요(kg단위) : ");
        int weight = input.nextInt();

        System.out.print("키를 입력하세요(cm단위) : ");
        int height = input.nextInt();

        if (weight <= height) {

            double heightM = (double) height / 100;


            double bmi = weight / (heightM * heightM);
            String bmi2 = null;


            if (bmi < 18.5) {
                bmi2 = "저체중";
            } else if (bmi < 23) {
                bmi2 = "정상";
            } else if (bmi < 25) {
                bmi2 = "과체중";
            } else {
                bmi2 = "비만";
            }
            //bmi >= 18.5 &&
            //bmi >= 23 &&
            //이전 if구문에서 결과값을 제외하기에 불필요함

            System.out.printf("당신의 BMI는 %.2f이며, '%s'입니다.%n", bmi, bmi2);
        } else {
            System.out.println("몸무게 수치는 키 수치보다 높을 수 없습니다");
        }
    }

    public static void Cal(Scanner input) {

        System.out.print("첫 번쨰 정수를 입력 해 주세요 : ");
        int num1 = input.nextInt();

        System.out.print("두 번째 정수를 입력 해 주세요 : ");
        int num2 = input.nextInt();

        System.out.print("연산기호를 입력 해 주세요 : ");
        String str = input.next();
        char ch = str.charAt(0);


        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            if (ch == '+') {
                System.out.printf("결과 : %d%n", num1 + num2);
            } else if (ch == '-') {
                System.out.printf("결과 : %d%n", num1 - num2);
            } else if (ch == '*') {
                System.out.printf("결과 : %d%n", num1 * num2);
            } else if (ch == '/') {
                if (num2 != 0) {
                    double d = (double) num1 / num2;
                    System.out.printf("결과 : %.2f%n", d);
                } else {
                    System.out.println("0으로 나눌 수 없습니다");
                }
            } else {
                System.out.println("알 수 없는 오류");
            }
        } else {
            System.out.println("지원하지 않는 연산자입니다");
        }
    }

    public static void Gugu(Scanner input) {

        System.out.print("몇 단을 출력 할 지 입력해 주세요 : ");
        int num1 = input.nextInt();

        System.out.printf("%d단 결과입니다%n", num1);


        if (num1 != 0) {
            for (int num2 = 1; num2 <= 9; num2++) {
                System.out.printf("%d X %d = %d%n", num1, num2, num1 * num2);
            }
        } else {
            System.out.println("0을 곱하면 값은 모두 0 입니다");
        }
    }

    public static void Sum(Scanner input) {

        int i = 1;
        int num;
        int sum = 0;
        do {
            System.out.printf("%d 번째 정수 입력 : ", i);
            int num1 = input.nextInt();
            num = num1;
            sum += num1;
            i++;
        }
        while (num != 0);
        System.out.printf("합계 : %d", sum);
    }

    public static void Old(Scanner input) {

        System.out.print("태어난 연도를 입력해 주세요 : ");
        int birthYear = input.nextInt();

        System.out.print("올해 연도를 입력해 주세요 : ");
        int thisYear = input.nextInt();

        if (birthYear < thisYear) {
            System.out.println(thisYear - birthYear + 1 + "살");

            if (birthYear % 2 == 0 && thisYear % 2 == 0) {
                System.out.println("태어난 해와 올해는 짝수 연도 입니다");
            } else {
                System.out.println("태어난 해와 올해 둘 다 짝수 연도가 아닙니다");
            }

            if (birthYear % 3 == 0 && thisYear % 5 != 0) {
                System.out.println("태어난 해가 3의 배수이고 올해는 5의 배수가 아닙니다.");
            }
        } else {
            System.out.println("태어난 해는 올해보다 이전이어야 합니다");
        }
    }

    public static void Result(Scanner input) {





    }






//    public static Student[] student1 = {
//            new Student(input.nextLine()),
//            new Student(input.nextLine()),
//            new Student(input.nextLine())
//    };
//    public static void Result(Scanner input) {
//        Student student[] = new Student[3];
//
//        for (int i = 0; i < student1.length; i++) {
//            System.out.print(i + 1 + "번 학생의 이름을 입력 해 주세요 : ");
//            String student = input.nextLine();
//        }
//
//        int score[] = new int[9];
//
//        for (int i = 0; i < score.length; i++) {
//            switch (i) {
//                case 0, 3, 6 -> System.out.println("국어 성적을 입력해 주세요 : ");
//                case 1, 4, 7 -> System.out.println("영어 성적을 입력해 주세요 : ");
//                case 2, 5, 8 -> System.out.println("수학 성적을 입력해 주세요 : ");
//            }
//            score[i] = input.nextInt();
//        }
//
//
//        int sum[] = new int[3];
//        for (int i = 0; i < score.length; i++) {
//            switch (i) {
//                case 0, 1, 2 -> sum[0] += score[i];
//                case 3, 4, 5 -> sum[1] += score[i];
//                case 6, 7, 8 -> sum[2] += score[i];
//            }
//        }
//
//        double avg[] = new double[3];
//
//        for (int i = 0; i < avg.length; i++) {
//            avg[i] = (double) sum[i] / 3;
//        }
//
//
//        for (int i = 0; i < avg.length; i++) {
//            System.out.println("이름: " + student1[i].getName());
//
//            int studentIndex = i * 3;
//            System.out.println("국어 점수: " + score[studentIndex] + ", 영어 점수: " + score[studentIndex + 1] + ", 수학 점수: " + score[studentIndex + 2]);
//
//            System.out.printf("평균: %.2f%n", avg[i]);
//
//            System.out.print("등급: ");
//            if (avg[i] >= 90) {
//                System.out.println("A등급");
//            } else if (avg[i] >= 80) {
//                System.out.println("B등급");
//            } else if (avg[i] >= 70) {
//                System.out.println("C등급");
//            } else if (avg[i] >= 60) {
//                System.out.println("D등급");
//            } else {
//                System.out.println("F등급");
//            }
//            System.out.println("--------------------");
//        }
//
//
//    }

}
//성적 출력결과 Student[] student = new Student[3]; //학생객체 필드수정해야함
//학생 객체 안에 성적 결과를 출력하는 메서드를 만들것
//학생객체의 생성은 현재 클래스 안에서 입력을 받아서 만들것
//배열이 완성되면 각 학생의 성적 결과를 출력하고 끝내기


//        for (int i = 0; i <= 2; i++) {
//            switch (i) {
//                case 0 -> System.out.print("국어 성적을 입력 해 주세요 : ");
//                case 1 -> System.out.print("영어 성적을 입력 해 주세요 : ");
//                case 2 -> System.out.print("수학 성적을 입력 해 주세요 : ");
//            }
//            score[i] = input.nextInt();
//            sum += score[i];
//        }
//
//        System.out.printf("=== 성적결과 ===%n");
//        System.out.print("점수 : ");
//        for (int j = 0; j <= 2; j++) {
//            System.out.printf("%d ", score[j]);
//        }

//        double avg = (double) sum / 3;
//        System.out.printf("%n총점 평균은 %.2f 입니다%n", avg);
//
//        if (avg >= 90) {
//            System.out.println("A등급");
//        } else if (avg >= 80) {
//            System.out.println("B등급");
//        } else if (avg >= 70) {
//            System.out.println("C등급");
//        } else if (avg >= 60) {
//            System.out.println("D등급");
//        } else System.out.println("F등급");









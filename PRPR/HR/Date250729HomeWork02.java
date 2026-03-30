package PRPR.HR;

import java.util.Scanner;

public class Date250729HomeWork02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

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
                break;
            }

        }

    }
}


//1. BMI 계산기 만들기
//
//
//
//사용자에게 키(cm)와 몸무게(kg)를 입력받고,
//
//
//
//BMI 계산 후 비만도 등급(저체중 / 정상 / 과체중 / 비만)을 출력하는 프로그램 작성
//
//
//
//double, 형변환, 조건문, printf 사용
//
//
//
//💡 BMI 계산식:
//BMI = 체중(kg) / (신장(m) * 신장(m))
//        💡 판정 기준
//BMI < 18.5: 저체중
//18.5 ≤ BMI < 23: 정상
//23 ≤ BMI < 25: 과체중
//25 이상: 비만
//
//        출력예시
//체중을 입력하세요 (kg단위) : 50
//신장을 입력하세요 (cm단위) : 160
//당신의 BMI는 19.53이며, '정상'입니다.
//학습 포인트: Scanner, 형변환, double, 조건문, printf 포맷팅

/*
cm, kg단위로 입력받으세요 > Scanner
등급에 따른 출력 구분 > 조건문
cm을 m으로 단위 변환

출력할 때 '당신의 bmi는 %.2f이며, '%s'입니다
 */








/*
250728복습
변수
데이터타입 + 형변환
연산자
제어문 > 조건문, 반복문
객체
 */
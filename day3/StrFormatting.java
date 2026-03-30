package day3;

public class StrFormatting {
    public static void main(String[] args) {
        //문자열 포맷팅
        //System.out.printf();
        //%서식지정자
        /*
        %d : 정수
        %f : 실수
        %s : 문자열
        %n : 줄바꿈
        %x / %X : 16진수(소문자/대문자)
         */
        double d= 123.45678;
        int n = 1234;
        String name = "홍길동";
        System.out.printf("이름은 %s입니다.%n", name);
        System.out.printf("이름은 %5s입니다.%n", name); //오른쪽 정렬
        System.out.printf("이름은 %-5s입니다.%n", name);  //왼쪽 정렬


        //정수
        System.out.printf("기본출력 %d%n", n);
        System.out.printf("오른쪽 정렬 출력 %10d: 정수%n", n);
        System.out.printf("왼쪽 정렬 출력 %-10d: 정수%n", n);
        System.out.printf("0채움 %010d%n", n);
//        System.out.printf("0채움 %0-10d%n", n); //왼쪽정렬은 채우기 못함

        //실수
        System.out.printf("실수값 포맷팅 %f%n", d);
        System.out.printf("실수값 포맷팅 %.2f%n", d); //소수점 2번째 자리까지만
        System.out.printf("실수값 포맷팅 %10.2f%n", d); //소수점 포함 10칸
        System.out.printf("실수값 포맷팅 %-10.2f%n", d);
        System.out.printf("실수값 포맷팅 %010.2f%n", d);

        int age = 20;
        String myName = "김태원";
        System.out.printf("이름 : %s, 나이 : %d", myName, age);
    }
}

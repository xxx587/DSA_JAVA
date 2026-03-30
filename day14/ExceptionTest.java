package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c;

        try {
            System.out.print("정수입력: ");
            a = input.nextInt();

            System.out.print("정수입력: ");
            b = input.nextInt();

            c = a / b;
            System.out.println(c);
        } catch (InputMismatchException e) {
            System.out.println("숫자로 입력하세요");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
            return;
        } catch (Exception e) {
            System.out.println("그 밖의 예외");
        } finally {
            System.out.println("무조건 실행. 주로 마무리 작업");
        }

        //예외처리 하려면 상위 하위 관계 잘 봐야함 > 하위가 먼저 오도록

        System.out.println("프로그램의 나머지 부분");

    }
}
/*
Error > 코드로 해결 불가
Exception 하위 > RuntimeException, IOException
RuntimeException = 필수가 아님
IOException = 컴파일 에러
 */
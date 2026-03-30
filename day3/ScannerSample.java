package day3;

//Scanner를 사용하기 위해 import 한다
import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        //2.Scanner 객체를 생성한다
        Scanner scanner = new Scanner(System.in); //시스템의 표준 입력 장치로 받은 입력을 변수(scanner)에 저장

        System.out.println("이름을 입력해 주세요 : ");
        String name = scanner.nextLine();
        System.out.println("안녕하세요, " + name + "님");

        System.out.println("숫자를 입력해주세요 : ");
        int a = scanner.nextInt(); //3.Scanner 객체를 사용하여 입력을 받는다. '.'을 사용해서 어느 데이터 타입을 받을 건지 지정 가능. scanner.nextInt()가 정수값을 반환해줌. 그 후에 변수 a에 대입

        //4.여러개를 입력받을 때는 1, 2는 제외 3번을 반복
        System.out.println("입력완료" + a);
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //5.입력받은 정수값 사용하기
        int result = a + b + c;
        System.out.println("입력받은 값의 합계 : " + result);

        System.out.println("변경하실 이름을 입력해 주세요 :");
        scanner.nextLine();
        String newName = scanner.nextLine();
        System.out.println("변경된 이름은 " + newName);
        //scanner 안에 enter가 남아 있음
        //nextInt();는 숫자만 읽음 (줄바꿈 문자를 읽지 않음)
        //버퍼에 남아있는 개행문자 (\n)을 제거해 줘야 함.

        scanner.close(); //사용이 완료 되었으면 close를 해서 리소스 해제


    }
}
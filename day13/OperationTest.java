package day13;

public class OperationTest {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        c = a++ + b; // ++a는 바로 1 증가시킴, a++은 코드 실행 후 나중에 증가시킴
        System.out.println(a + "," + b + "," + c);

        boolean res = a < 0 && b < 0; // &&의 경우 앞부분이 false면 뒷부분을 보지 않음, ||의 경우 앞 부분이 true면 뒷 부분을 보지 않음, &를 사용하거나 따로 빼서 입력
        a++;
        b++;
        System.out.println(a + "/" + b + "/" + res);

        double d = (double) 10 / 3;
        System.out.println(d);

        c = a + b + 1 + 2;
        c = b = a = 1;

        a = 3;
        c = a << 2;
        System.out.println(c);

        a = 9;
        b = 3;
        c = a & b;
        System.out.println(c);


    }
}

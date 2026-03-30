package day13;

public class TypePractice {
    public static void main(String[] args) {

        char ch = '\u0041';
        String s = "abc\ndef\tghi"; // \n 개행, \t 탭 넣기
        String s2 = "c:\\backup\\test"; // \는 \\로 출력
        byte b = 127;
        b++; // 128 오버플로우 발생 > 음수로 값 넘어감 > -128
        int i = 0xff; // 0xff(16) == 15*15(10)
        long lo = 100000000L;
        char c2 = '가';

        System.out.println(ch); // 문자열로 출력
        System.out.println(s);
        System.out.println(s2);
        System.out.println(b); // -128
        System.out.println(i);
        System.out.println(lo);
        System.out.println((char) (ch + 1)); //데이터타입 형변환
        System.out.println(s + 1);
        System.out.println((char) (c2 + 1)); //데이터타입 형변환
    }
}

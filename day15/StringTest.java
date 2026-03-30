package day15;

public class StringTest {
    public static void main(String[] args) {
        String a; //초기화 안됨
        String b = null; //null .length 해주면 null값이라고 에러남
        String c = "abc"; //abc
        String d = "abc"; //abc
        String e = d; //abc d의 주소를 가리킴
        String f = new String("abc"); //abc
        String g = new String("Java Programming");
        String h = ""; //빈 객체 만들어짐 .length는 0

        //String에서 == 연산자는 주소 비교 .equals()가 내용 비교 > .equals는 대소문자까지 완벽히 일치해야함
        //equalsIgnoreCase > 대소문자 무시, startsWith > 앞부분만 비교(2자리 이상 가능), endsWith > 뒷부분만 비교
        //charAt > 해당하는 위치 글자 char 타입으로 리턴, indexOf > 앞에서 몇번째 자리에 있는지 없는 경우 -1 리턴
        // lastIndexOf > 가장 뒤에서 몇 번째 자리에 있는지
        // substring(n, m) > n번째 자리부터 m번 전 자리까지 출력, concat > 뒤에 문자열 붙이기, toUpperCase > 대문자로, toLowerCase > 소문자로
        //String의 .메소드는 원본을 변경하는게 아니라 새로 객체를 만듬

        System.out.println(g.indexOf("x"));
    }
}

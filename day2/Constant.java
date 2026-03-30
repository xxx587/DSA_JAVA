package day2;

public class Constant {
    public static void main(String[] args) {
        //상수 (주로 대문자로 작성하고 단어 사이는_로 연결)
        //변하지 않는 값을 저장하기 위함
        //코드는 순서대로 진행되기에 순서에 맞게 작성

        final int MAX_NUM = 100; //final > 값을 변하지 않게 하겠다
        final int MIN_NUM;

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

//        MIN_NUM = -99; 최초 한 번의 대입만 가능함 (변경 불가) > final 사용

    }
}

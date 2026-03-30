package day7;

public class DataType {
    //데이터를 저장하는 공간의 크기는 바이트 단위로 말한다.
    //변수를 선언할 때, 데이터 타입을 정해야 한다.
    //변수를 선언한다는 것은 선언한 변수 이름으로 어떤 위치에 있는 메모리를 얼마만큼의 크기롤 사용하겠다는 뜻.

    /*
    기본 자료형 (원시 자료형, primitive type)  글자 1개 ''사용
    1byte = 8bit -128 ~ 127
    정수형 : byte(1), short(2), int(4), long(8) (저장공간의 차이 때문에 여러가지가 있음. int를 주로 사용하는 이유는 4bite 연산이 효율적이라서)
    문자형 : char(2)
    실수형 : float(4), double(8) (실수는 소수점을 표현 가능. 정수는 소수점 표현 불가)
    논리형 : boolean(1) (true, false 저장 가능)
    각 자료형은 담을 수 있는 데이터의 크기가 다르다. 데이터가 넘치면 오류가 난다.
     */

    /*
    참조 자료형   글자 길게 ""사용
    문자열을 저장하는 String > 참조 자료형에 속함
    값을 저장하는 방식과 그 값에 접근하는 방식에서 차이가 난다
    참조 자료형은 실제 데이터는 다른곳에 있고 그 위치가 어디인지를 변수에 저장하는 방식
     */

    public static void main(String[] args) {
        //정수형
        byte bVal = 20;
//        byte overByteVal = 128; 컴파일 오류
        short sVal = 30;
        int iVal = 40;
        long lVal = 1234567890L; //long은 뒤에 L을 써주기도 함
        print(bVal + sVal + iVal);

        //문자형
        //문자를 변수에 대입하면 문자 그대로 저장되는 것이 아니라 그 문자에 해당하는 정수값(아스키코드)이 저장됨
        char ch1 = 'A'; //문자형은 1개만 들어감
//        char ch1 = "A"; ""는 String
        System.out.println(ch1);
        System.out.println((int)ch1); //A의 아스키코드 65가 출력됨. 강제 형변환

        char ch2 = 66; //문자에 할당된 아스키코드 번호가 됨
        System.out.println(ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3); //아스키값도 문자형으로 변환이 가능함

        char ch4 = '한';
        char ch5 = '\uD55c'; //Unicode값도 가능
        System.out.println(ch4);
        System.out.println(ch5);
        System.out.println((int)ch4); //아스키값 확인

//        char ch6 = -65; 문자열에 음수값 저장 불가

        //논리형
        boolean isStudent = true;
        print(isStudent);
//        System.out.println((int)isStudent); 논리형을 정수형으로 형변환 못함

        //실수형
        double dNum = 3.14D;  //D 필수 아님
        float fNum = 3.14F; //float의 경우에는 뒤에 F를 넣어줘야 함
        print(dNum);
        System.out.println(fNum);

        System.out.println(0.1+0.2); //0과 1로 소수점 아래의 숫자를 정확하게 표현할 수 없기 때문에 연산 결과에 오차가 생긴다
        //컴퓨터의 2진수와 현실의 10진수 각 표현방식의 차이로 인해 표현 가능한 값에 차이가 생기기 때문


        //잠조 자료형 맛보기
        String s1 = "Hello";
        System.out.println(s1);
        print(s1);



    }

    public static void print(int a){
        System.out.println("정수를 출력합니다 : " + a);
        //void : 반환값이 없다 (return)값이 없음
    }

    public static void print(boolean b){
        System.out.println("논리형 값을 출력합니다 : " + b);
        //함수의 오버로딩
        //같은 이름의 메서드를 여러 개 정의하되, 매개변수의 개수나 타입을 다르게 정의하여 사용하는 기능
        //메서드 이름은 같아야 한다
        //매개변수의 개수 또는 타입이 달라야 한다
        //반환 타입은 오버로딩에 영향을 주지 않는다 (매개변수가 같고 반환값만 다른 것은 각 메서드를 구분 할 수 없음)
    }

    public static void print(double c){
        System.out.println("숫자를 출력합니다 : " + c);
    }

    public static void print(String d){
        System.out.println("문자열을 출력합니다 : " + d);
    }
    //함수로 분리하는 것의 장점
    //1. 가독성 향상
    //2. 재사용성 증가, 중복코드 제거
    //3. 유지보수 용이성
    //4. 테스트 용이성
    //5. 의도명확화
}

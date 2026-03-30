public class Variable {
    public static void main(String[] args) {
        //변수 : 값을 담는 상자
        //값 : 메모리에 저장된 데이터 조각
        int num;    //int : 상자의 모양(int는 정수 타입) / num : 상자의 이름 > 정수형 변수 num 선언
        num = 100;  //num 변수에 값 100 대입/할당
        System.out.println(num);  //println("...")을 하면 ...은 텍스트가 됨. num 상자에 들어있는 데이터를 출력


        int num2 = 200; //변수 선언과 동시에 값을 대입
        //변수를 준비해서 처음으로 값을 넣는것 > 변수 초기화
        System.out.println(num2);  //println("...")을 하면 ...은 텍스트가 됨. num 상자에 들어있는 데이터를 출력

        //변수 이름 규칙
        //1. 영문자나 숫자를 사용. 특수문자는 $와_는 사용 가능
        //2. 숫자로 시작할 수 없다.
        //3. 예약어를 사용할 수 없다. (ex.주황색으로 나오는 글씨 / main, out은 사용 가능)


        num = 300;
        //할당된 100은 사라지고 새롭게 300이 할당됨
        System.out.println(num);

        //int $_variable = 100;
        //int 345var = 345;
        int out = 1000;
        //정적 검증 ex)빨간 글씨로 나오는 것. 이 프로그램(intellij) 내에서 하면 안된다고 알려주는 것



    }
}
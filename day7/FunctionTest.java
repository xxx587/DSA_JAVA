package day7;

public class FunctionTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int result = addNum(num1, num2);
        System.out.println(result);
        System.out.println(addNum(num1, num2));


        /*
        함수? 하나의 기능을 수행하는 코드 덩어리
        한 작업을 여러번 반복한다면 함수로 만들어두고 필요할 때마다 호출해서 쓸 수 있다
        전달 할 때, 전달 받을 때는 함수 선언할 때 지정된 대로(타입, 순서)

        함수로 분리하는 것의 장점
        1.가독성 향상
        2.채사용성 증가

         */


    }


    //javadoc주석 메서드 위에서 /**로 열기
    //주석 블록 안에서 특별한 태그들을 사용해 문서화 할 수 있다
    /**
     * 첫 번째 항과 두 번째 항을 더하기 연산 한 결과를 반환한다
     * @param a 첫 번째 항
     * @param b 두 번째 항
     * @return 결과값
     */
    public static int addNum(int a, int b) {
        //public static은 써 줘야 함(함수를 사용 가능하게 해줌), addNum은 함수 이름, int는 반환값 타입, () 부분에 받아올 값이 뭔지 입력, {}부분에는 실행
        int result = a + b;
        return result;
    }
}


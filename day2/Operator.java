package day2;

public class Operator {
    public static void main(String[] args) {
        //연산자 : 연산에 사용하는 기호
        //항 : 연산에 사용하는 값

        //연산자의 종류
        /*
        1. 대입연산자 (오른쪽 항에 있는 값을 왼쪽 항에 대입. 왼쪽에는 변수나 상수가 와야 한다) // 복합대입연산자
        2. 산술연산자 (+, -, *, /, %)
        3. 증감연산자 (++ --)
        4. 관계연산자 (== != < > <= >=)
        5. 논리연산자 (and => && / or => (||) / not => !) >> 논리값을 확인해서 결과 반환 / not은 해당 논리값을 반대로 바꿔주는 연산자
        6. 비트연산자 (X)
        7. 조건연산자 (삼항연산자)
        8. 인스턴스연산자
        9. 형변환연산자
         */


        //산술연산자
        int mathScore = 50;
        int engScore = 60;

        int totalScore = mathScore + engScore;
        System.out.println(totalScore);

        double avgScore = totalScore / (float)2;
        System.out.println(avgScore);

        System.out.println(5*3);
        System.out.println(5-3);
        System.out.println(5%2);


        //증감연산자 (연산을 한 뒤 재할당이 일어나 해당 값도 바뀜, 앞에 붙으면 증감 후 출력, 뒤에 붙으면 이후에 증감)
        int gameScore = 150;
        int lastScore = ++gameScore;
        System.out.println(lastScore);
        System.out.println(gameScore); //150이 아닌 151로 출력
        System.out.println(lastScore++); //값을 출력한 뒤에 증감이 발생함
        System.out.println(++lastScore); //이전 행의 ++이 적용되며 이번 행의 ++도 적용됨
        System.out.println(--lastScore);
        System.out.println(lastScore--);
        System.out.println(lastScore);


        //관계연산자(논리값을 반환하는 연산자)
        System.out.println(1>3); //False
        System.out.println(1<3); //True
        System.out.println(1>=3); //False
        System.out.println(1<=3); //True
        System.out.println(1==3); //False
        System.out.println(1!=3); //True

        System.out.println("250723------------------");

        //논리연산자
        //and연산자(논리곱) => && >> 둘 다 참일 때 참
        //or연산자(논리합) => || >> 둘중 하나라도 참일 때 참
        //not연산자(부정) => ! >> 단항연산자 논리형 값을 반대의 값으로 바꿈

        int num1 = 10;
        int num2 = 20;
        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag);       //true

        flag =  (num1 > 0) && (num2 < 0);
        System.out.println(flag);       //false

        flag =  (num1 > 0) || (num2 < 0);
        System.out.println(flag);       //true

        flag =  (num1 < 0) || (num2 < 0);
        System.out.println(flag);       //false

        System.out.println(!flag);      //true
        System.out.println(flag);       //false >> 재대입이 일어나지 않음


        //단락 회로 평가 77p
        //좌항에 먼저 나오는 것에 따라서 우항을 실행할 것인지가 갈림
        int i = 2;
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 2); //좌항이 false이기 때문에 연산이 끝나 우항의 대입(실행) 자체가 안됨
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        System.out.println("---------------------------");

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 2); //좌항이 true이기 때문에 연산이 끝나 우항의 대입(실행) 자체가 안됨
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        //밖으로 빼는 법
        int result1 = num1 + 10;
        int result2 = i + 2;
        value = ((result1) > 10) || ((result2) < 2);

        //삼항연산자(조견연산자)
        //조건문 ? 참일 때 : 거짓일 때
        System.out.println((5 > 3) ? 10 : 20);

        int fatherAge = 45;
        int motherAge = 47;
        String result;
        result = (fatherAge > motherAge) ? "아버지 나이가 어머니 나이보다 많습니다" : "어머니 나이가 아버지 나이보다 많습니다";
        System.out.println(result);


        //복합대입연산자
        //연산자의 좌항에서 우항의 값을 ~~해서 좌항에 대입
        i = i + 2;
        i += 2;
        System.out.println(i);
        num1 -= 1;
        System.out.println(num1);
        num1 *= 2;
        System.out.println(num1);
        num1 /= 10;
        System.out.println(num1);
        num1 %= 2;
        System.out.println(num1);

    }
}

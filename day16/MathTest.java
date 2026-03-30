package day16;

public class MathTest {
    public static void main(String[] args) {
        double res = 1;
        int a = 2;
        int b = 10;

        res = Math.pow(2, 10);

//        for (int i = 1; i <= b; i++) {
//            res *= a;
//        }

        System.out.printf("%d의 %d승 = %f%n", a, b, res);
        System.out.println(Math.sqrt(9)); //제곱
        System.out.println(Math.abs(-9)); //절댓값
        System.out.println(Math.round(3.5)); //반올림
        System.out.println(Math.floor(3.5)); //내림
        System.out.println(Math.ceil(3.5)); //올림
        System.out.println(Math.round(-3.5)); //반올림
        System.out.println(Math.random()); //무작위수



    }
}

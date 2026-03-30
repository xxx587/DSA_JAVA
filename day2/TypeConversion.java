package day2;

public class TypeConversion {
    public static void main(String[] args) {

        //묵시적 형변환 Implicit Conversion > 작은것에서 큰것으로
        //바이트 크기가 작은 자료형에서 크기가 큰 자료형으로 자동(묵시적 / 차지하는 메모리가 더 큰)으로 이루어진다
        //정밀하지 않은 자료형(정수형)에서 더 정밀한 자료형(실수형)으로 자동으로 이루어진다

        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(iNum2);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);

        //명시적 형 변환 Explicit Conversion
        //묵시적 형 변환과 반대의 경우
        //형 변환 시 데이터의 손실이 발생할 수 있다.

        int num1 = 10;
        byte num2 = (byte)num1;  //byte에 넣을 거라고 아ㅠ에 (byte)를 적어줘야 함
        System.out.println(num2); //크기가 큰 자료형에서 작은 자료형으로 대입해서 데이터 손실이 발생함(오버플로우 > 에러가 나오지 않고 값이 나옴)


        double dNumPI = 3.14; //3.94로 하면 올림/내림/반올림이 아닌 그냥 소수점을 버림
        int iNum1 = (int)dNumPI;
        System.out.println(dNumPI);


        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2; //형 변환을 하고 나서 계산하기 > 소수점 부분을 버리기 때문에 1.2는 1이 되고 0.9F는 0이 되어 1이 출력
        int iNum4 = (int)(dNum1 + fNum2); //계산을 하고 형 변환하기 > 계산을 하면 2.1이기 때문에 소수점을 버린 2가 출력됨

        System.out.println(iNum3);
        System.out.println(iNum4);
        //형변환과 계산의 순서에 의해 결과값이 다를 수 있다


    }
}

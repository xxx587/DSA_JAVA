package day2;

public class Practice {
    public static void main(String[] args) {
        //1.'희'라는 한글 글자의 유니코드 정수값을 찾아서 적절한 변수에 저장한 뒤 변수를 출력하여 확인
        //2.본인 이름을 적절한 자료형의 변수에 담아 출력
        //3.출생연도를 저장하는 변수를 만들어 선언과 동시에 초기화
        //4.바이트타입의 변수 두 개에 10과 20을 저장하고 바이트 타입의 새 변수에 저장하고 출력
        //5.태블릿소지여부를 변수에 저장하고 출력

        char krUni = '희';
        int uniVal = (int)krUni;
        System.out.println(uniVal);

        //16진법으로 바꾸고 역슬래쉬u를 해주면 유니코드가 됨

        String name = "김태원";
        System.out.println(name);

        int year = 2000;
        System.out.println("출생년도는 "+year+"년 입니다.");


        byte bNum1 = 10;
        byte bNum2 = 20;
        byte bNumSum = (byte)(bNum1 + bNum2); //int타입을 반환하는 연산
        System.out.println(bNumSum);


        boolean tabYesNo = true;
        System.out.println(tabYesNo);

    }
}
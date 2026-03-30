package day9.encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        //휴대폰 공장에서 생산
        Phone phone = new Phone("아이폰", 1000000);

        //판매점 객체 생성, 단 한 기종만 팔 수 있는 대리점
        PhoneStore store = new PhoneStore(phone);

        //손님
        Customer customer = new Customer("김형근", 1000000);

        //손님이 구매를 한다
        customer.buyPhone(store);


    }
}

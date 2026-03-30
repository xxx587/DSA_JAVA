package day9.encapsulation;

public class Customer {

    private String name;
    private double budget;

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    //클래스 다이어그램 : 그림을 그려서 어떤 관계를 맺는지 나타낸 것 (구조를 봐서 확인)
    //main ---- Phone, Customer, PhoneStore(관계) >>> 여기서 행동의 주체는 Customer
    //생성자(객체 생성 재료) ex.PhoneStore(Phone)
    //buyPhone(PhoneStore)라는 동작을 고객이 할 수 있게 함
    //생성자 이름은 클래스 이름과 같이

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    /**
     * 고객이 휴대폰을 사는 동작
     * 대리점 객체가 휴대폰을 파는 매서드를 호출
     * todo : 고객이 구입하려는 휴대폰 기종과 대리점이 취급하는 기종의 일치여부를 확인
     * @param store 대리점
     */
    public void buyPhone(PhoneStore store) {
        Phone phone = store.sellPhone("아이폰", budget); //할 수 있는 행동 호출 (Phone은 여기서 리턴 타입 맞춰주는 역할)
        phone.getModel();

        if (phone == null) {
            System.out.println("고객 : 핸드폰 " + phone.getModel() + "을 구입하지 못했습니다.");
        } else {
            System.out.println("고객 : 핸드폰 " + phone.getModel() + " 구입이 완료되었습니다.");
        }

        //고객이 휴대폰을 살 때 일어나는 일

        //대리점이 휴대폰을 팔 수 있냐 없냐를 구분하는 분기

        //구입했을 때의 출력문

        //구입하지 못했을 때의 출력문

    }
}
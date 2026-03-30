package day8.kitchen;

public class Ramen {//설계도 개념
    //필드
    public String noodleType;
    String soupType;
    boolean isCooked;

    //생성자 : 클래스 이름과 같은 이름을 가진 매서드
    //객체가 생성될 때 호출되어 객체의 초기 상태를 설정하는 특수한 매서드
    //new키워드와 함께 호출하며 새 객체를 생성하기 위한 매서드
    //일반 메서드와 달리 반환값을 설정하지 않는다

    public Ramen() {
        //기본 생성자(디폴트 생성자) : 생성자를 직접 만들지 않으면 자동으로 만들어 준다
        //기본생성자를 통해 만들어진 객체의 인스턴스변수에는 각 타입의 기본값이 들어간다
    }
    //생성자는 같은 이름으로 여러 개 만들 수 있다 > 생성자 오버로드

    public Ramen(String noodleType, String rSoupType){
        //매개변수가 다르면 그거에 맞춘 생성자가 호출됨
        //this 키워드 : 생성된 인스턴스 스스로를 가리키는 예약어
        this.noodleType = noodleType;
        soupType = rSoupType;
        isCooked = false;
    }

    //메서드
    void boilWater() {
        System.out.println("물을 끓입니다");
    }

    void addNoodles() {
        System.out.println(noodleType + " 면을 넣습니다");
    }

    void addSoup() {
        if (soupType == "가루스프") {
            System.out.println("스프를 넣습니다...");
        } else {
            //물 버리고 스프 넣기
            System.out.println("액상 스프를 넣습니다");
        }
    }

    public void cook() {
        boilWater();
        addNoodles();
        addSoup();
        isCooked = true;
        System.out.println("라면이 완성되었습니다!");
    }

    public boolean getIsCooked() {
        return isCooked;
    }
}

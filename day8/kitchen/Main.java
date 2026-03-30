package day8.kitchen;

public class Main {
    public static void main(String[] args) {

        //인스턴스 = 실제 요리
        Ramen spicyRamen = new Ramen();
        spicyRamen.noodleType = "매운라면";
        spicyRamen.soupType = "가루스프";

//        String noodleType;
//        String rSoupType;
//
//        Ramen spicyRamen = new Ramen(noodleType:"매운라면", rSoupType:"가루스프");
//
//        Ramen mildRamen = new Ramen(noodleType:"안매운라면", rSoupType:"액상스프");
//        spicyRamen = mildRamen;

        //조리 시작
        spicyRamen.cook();
        System.out.println(spicyRamen.getIsCooked());
        System.out.println(spicyRamen);

        //라면이라는 추상적 개념 > 클래스
        //인스턴스는 그 실체인 라면봉지
        //클래스를 통해 생성된 실체를 인스턴스라고 부름
        //인스턴스가 생성되면
        //변수에 인스턴스를 담는다 치고 변수 이름은 스택에 저장됨
        //그 실체(객체_인스턴스)는 힙 메모리에 저장이 됨
        //변수에 담긴 값은 리모컨, 리모컨이 객체(인스턴스)를 가리켜 정보나 행동을 가져옴
    }
}

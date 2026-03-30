package day9;

import day8.kitchen.Ramen;

public class AccessModifierTest {

    /*
    접근 제어자
    public : 외부 클래스 어디에서나 접근 가능
    default(공란) : 같은 패키지 내부에서만 접근 가능
    private : 같은 패키지 내부와 상속관계인 클래스에서만 접근 가능 그 외 클래스에서는 접근 할 수 없다 동일 클래스 내에서는 접근 가능 public을 사용해 prvate에 접근
    protected : 같은 클래스 내부에서만 접근 가능
     */

    public static void main(String[] args) {

        Ramen ramen = new Ramen("너구리", "가루스프");
        printStatus(ramen);
        ramen.cook();
        printStatus(ramen);

    }

    static void printStatus(Ramen ramen) {

        boolean flag = ramen.getIsCooked();
//        ramen.cook();
//        flag = ramen.getIsCooked();

        if (flag) {
            System.out.println("새로 생성된 라면 인스턴스 " + ramen.noodleType + "는 조리된 상태입니다");
        } else {
            System.out.println("새로 생성된 라면 인스턴스 " + ramen.noodleType + "는 아직 조리되지 않았습니다");
        }

    }


}

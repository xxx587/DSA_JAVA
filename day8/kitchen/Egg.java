package day8.kitchen;

public class Egg {

    String eggType;
    String oilType;
    boolean isHalfCook = false;
    boolean isCook = false;
    String Sauce;
    String Dish;

    void mixEgg() {
        System.out.println("계란을 풀어줍니다");
    }

    void onFire() {
        System.out.println("프라이팬을 불에 올립니다");
    }

    void onOil() {
        System.out.println(oilType + "를 뿌립니다");
    }

    void onEgg() {
        System.out.println(eggType + "을 넣습니다");
        isHalfCook = true;
    }

    void halfCook() {

        System.out.println("계란을 뒤집어 줍니다");
    }

    void make() {
        System.out.println("계란말이 모양으로 만들어 줍니다");
    }

    void cut() {
        System.out.println("칼로 먹기 좋은 사이즈로 잘라 줍니다");
    }

    void selectDish() {
        if (Dish == "동그란 접시") {
            System.out.println("동그란 접시에 계란말이를 올립니다");
        } else {
            System.out.println(Dish + "에 계란을 올려 줍니다");
        }
    }

    void Sauce() {
        if (Sauce == "케챱") {
            System.out.println("케챱을 뿌려 줍니다");
        } else {
            System.out.println(Sauce + "소스를 뿌려 줍니다");
        }
        isCook = true;
    }

    void isCooked() {
        System.out.println(eggType + "으로 " + oilType + "을 사용해서 " + Dish + "에 올려 " + Sauce + "을 뿌린 계란말이가 완성 되었나요? " + isCook);
    }



}

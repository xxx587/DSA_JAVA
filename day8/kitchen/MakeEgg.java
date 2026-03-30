package day8.kitchen;

public class MakeEgg {
    public static void main(String[] args) {

        Egg yellowEgg = new Egg();

        yellowEgg.eggType = "노란 계란";
        yellowEgg.oilType = "올리브유";
        yellowEgg.Sauce = "케챱";
        yellowEgg.Dish = "동그란 접시";


        yellowEgg.mixEgg();
        yellowEgg.onFire();
        yellowEgg.onOil();
        yellowEgg.onEgg();
        System.out.println("계란의 윗면이 익어가나요? " + yellowEgg.isHalfCook);
        yellowEgg.halfCook();
        yellowEgg.make();
        yellowEgg.cut();
        yellowEgg.selectDish();
        yellowEgg.Sauce();
        yellowEgg.isCooked();

    }
}

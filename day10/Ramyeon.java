package day10;

public class Ramyeon {

    int price;
    String menuName;
    public static int num = 0;
    int orderNum;

    @Override
    public String toString() {
        return "Ramyeon{" +
                "price=" + price +
                ", menuName='" + menuName + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }

    public Ramyeon(int price, String menuName) {
        num++;
        this.orderNum = num;
        this.price = price;
        this.menuName = menuName;
    }

    public void cook() {
        System.out.println("주문번호 : " + this.orderNum);
        boil();
        addSoup();
        addMyeon();
        doneRamyeon();
    }


    public void boil() {
        System.out.println("물을 넣어 끓입니다");
    }

    public void addSoup() {
        System.out.println("스프를 넣습니다");
    }

    public void addMyeon() {
        System.out.println("면을 넣습니다");
    }

    public void doneRamyeon() {
        System.out.println("라면이 완성되어 왔습니다");
    }


}

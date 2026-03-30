package day10;

public class Customer {

    private String name;
    private int budget;

    public Customer(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public void goStore(Store store) {
        System.out.println(store.storeName + "에 갑니다");
    }


    public void buyMenu(Customer customer, Ramyeon ramyeon) {
        System.out.println("예산 : " + customer.budget + " 라면 가격 : " + ramyeon.price);
        if (customer.budget >= ramyeon.price) {
            System.out.println("라면을 구매 할 수 있습니다");
        } else {
            System.out.println("라면을 구매 할 수 없습니다");
        }
    }


    public void orderRamyeon(Ramyeon ramyeon) {
        System.out.println(ramyeon.menuName + "를 주문합니다");
    }

    public void eat() {
        System.out.println("라면을 맛있게 먹습니다");
    }

    public void pay(Ramyeon ramyeon) {
        System.out.println("라면 값을 지불합니다");
        budget = budget - ramyeon.price;
        System.out.println("남은 예산 : " + budget);
    }

    public void all(Customer customer, Ramyeon ramyeon, Store store) {
        if (customer.budget >= ramyeon.price) {
            customer.goStore(store);
            customer.buyMenu(customer, ramyeon);
            customer.orderRamyeon(ramyeon);
            ramyeon.cook();
            customer.eat();
            customer.pay(ramyeon);
        } else {
            customer.goStore(store);
            customer.buyMenu(customer, ramyeon);
        }
    }

}

//heap 객체의 공간, garbage collector 가리킬게 없어져서 쓸 수 없게 되면 지움
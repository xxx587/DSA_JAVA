package day10;

import java.util.Scanner;

public class Store {

//    public Ramyeon ramyeon;
//
//    public Store(Ramyeon ramyeon) {
//        this.ramyeon = ramyeon;
//    }
    String storeName;

    public Store (String storeName) {

        this.storeName = storeName;
    }

    public static void main(String[] args) {

        Ramyeon ramyeon = new Ramyeon(2000, "너구리");

        Customer customer = new Customer("태원", 10000);

        Store store = new Store("김밥천국");

//        makeRamyeon(Ramyeon ram) {

        Scanner input = new Scanner(System.in);
        boolean isTrue = true;

            System.out.println("김밥천국에 가서 너구리 라면을 주문하시겠습니까? yes/no로 입력해 주세요");
            if (input.nextLine().equals("yes")) {
                customer.all(customer, ramyeon, store);
                while (isTrue) {
                System.out.println("한 그릇 더 먹겠습니까? yes/no로 입력해 주세요");
                if (input.nextLine().equals("yes")) {
                    customer.all(customer, ramyeon, store);

                } else {
                    System.out.println("더 먹지 않습니다");
                    isTrue = false;
                }}
            } else {
                System.out.println("그렇게 하지 않습니다.");
            }



    }
}
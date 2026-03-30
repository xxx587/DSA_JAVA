package PRPR.BookPR;

public class test05_10_1 {

    int orderNum;
    String orderId;
    String orderDate;
    String name;
    String orderShopping;
    String address;

    test05_10_1(int orderNum, String orderId, String orderDate, String name, String orderShopping, String address) {
        this.orderNum = orderNum;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.name = name;
        this.orderShopping = orderShopping;
        this.address = address;
    }

    void result() {
        System.out.printf("출력 결과%n주문 번호 : %d%n주문자 아이디 : %s%n주문 날짜 : %s%n주문자 이름 : %s%n주문 상품 번호 : %s%n배송 주소 : %s", orderNum, orderId, orderDate, name, orderShopping, address);
    }

}
package day18;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
//        System.out.println(list.get(11)); IndexOutOfBoundsException
        list.add(0, 99);
        list.add(4, 7);
        System.out.println(list);
        list.set(0, 88);
        System.out.println(list);

        for (int i = 0; i < list.toArray().length; i++) {
            System.out.println(list.get(i));
        }
    }
}

/*
추상 클래스거나 인터페이스이기 때문에 객체 생성을 못함
list: 선형 구조, 순서, 같은값 여러개 들어갈 수 있음 (배열)
set: 주머니 구조, 주머니에 넣고 꺼낼 수 있음, 순서가 없음, 들어 있냐 없냐만 확인 가능, 순서가 없어서 같은 값이 2번 이상 못들어감 (정렬 불가)
map: 데이터베이스 테이블 같은 구조 (key, value) key값으로 찾거나 이름을 정할 때 타입 상관 없음, 순서는 없으며 모든게 key 기준으로
 */

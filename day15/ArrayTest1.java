package day15;

public class ArrayTest1 {
    public static void main(String[] args) {
        int ar[] = new int[5]; // new이기 때문에 힙 영역에 있음. 컴파일 시 확인 안함
        int ar2[];
        ar2 = new int[5];
        int ar3[] = {10,20,30,40,50};

        System.out.println(ar3);
        System.out.println(ar3[0]);
        ar3[0]++;
        System.out.println(ar3[0]);
//        System.out.println(ar3[55]); 힙 영역에서 일어나는 일은 컴파일 검사 안함
        for (int i = 0; i < ar3.length; i++) {
            System.out.println(ar3[i]);
        }

        int ar4[] = new int[6];
        ar4 = ar3;

        System.out.println(ar4[4]);

    }
}
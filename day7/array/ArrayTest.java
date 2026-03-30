package day7.array;

public class ArrayTest {
    public static void main(String[] args) {

        /*
        배열 : 같은 자료형을 가진 자료 여러개를 묶어서 관리
        배열의 위치 : index 0부터 시작함
         */

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums = {1, 2, 3}; //배열 선언과 초기화
        int[] nums1 = new int[3]; //배열 생성과 초기화 (default값이 들어감)

        int[] numsErr;
        //numsErr = {1,2,3}; 안됨
        //numsErr[0] = 1; 안됨
        //int[] numsErr2 = new int[3] {1,2,3}; new int 부분을 지우던지 중괄호 부분 지우던지 둘 중 하나 해야함


        int[] numsOK;
        numsOK = new int[3]; // 배열은 생성할 때 무조건 칸 수 지정해야함
        numsOK[0] = 1;
        numsOK[1] = 2;
        numsOK[2] = 3;

        System.out.println(numsOK[0]);
        System.out.println(numsOK[1]);
        System.out.println(numsOK[2]);
        System.out.println("배열의 길이 : " + numsOK.length);

        for (int i = 0; i < numsOK.length; i++) { //.length : 배열의 길이
            System.out.println(numsOK[i]);
        }


    }
}

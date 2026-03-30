package day16;

public class MathTest2 {
    public static void main(String[] args) {

        int n;
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            n = (int) (Math.random() * 45 + 1); //random으로 1~45
            arr[i] = n;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
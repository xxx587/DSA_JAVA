package day17;

public class SortTest {
    public static void main(String[] args) {
        double arr[] = {1.5, 3, 10.2, 33.1, 2.345};
        double temp;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("====버블 정렬====");

        double arr2[] = {1.5, 3, 10.2, 33.1, 2.345};

        for (int i = arr2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
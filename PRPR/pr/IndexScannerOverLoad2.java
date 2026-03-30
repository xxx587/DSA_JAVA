package PRPR.pr;

public class IndexScannerOverLoad2 {








    public void indexAll(int arr[]) {
        System.out.println("배열에 들어 있는 모든 정수를 출력합니다.");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public void startIndex(int start, int arr[]) {
        for (int i = start; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }






}

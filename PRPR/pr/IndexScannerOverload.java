package PRPR.pr;

import java.util.Scanner;

public class IndexScannerOverload {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("몇 칸의 정수의 배열을 생성할 지 입력 해 주세요: ");
        int arrNum = input.nextInt();
        int arr[] = new int[arrNum];


        System.out.printf("정수 %d개를 입력 해 주세요%n", arrNum);

        for (int i = 0; i < arrNum; i++) {
            System.out.printf("%d번째 정수: ", i + 1);
            arr[i] = input.nextInt();
        }


        IndexScannerOverLoad2 print = new IndexScannerOverLoad2();


        System.out.println("입력한 모든 숫자들은");
        print.indexAll(arr);
        System.out.println("입니다");


        System.out.print("몇 번째 입력한 숫자부터 볼 건지 입력 해 주세요 : ");
        int start = input.nextInt() - 1;
        print.startIndex(start, arr);





    }
}
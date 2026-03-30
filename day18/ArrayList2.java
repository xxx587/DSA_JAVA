package day18;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> checkList = new ArrayList<>();

        boolean isTrue = true;
        int sum = 0;
        double avg;
        int temp = 0;

        while (isTrue) {
            for (int i = 0; ; i++) {
                System.out.print("정수를 입력 해 주세요: ");
                try {
                    list.add(i, input.nextInt());
                } catch (InputMismatchException e) {
                    for (int j = 0; j < list.toArray().length; j++) {
                        sum += list.get(j);
                    }

                    avg = (double) sum / list.toArray().length;
                    System.out.println("평균: " + avg);

                    for (int k = 0; k < list.toArray().length; k++) {
                        if (avg <= list.get(k)) {
                            checkList.add(list.get(k));
                        }
                    }

                    for (int j = 0; j < checkList.toArray().length; j++) {
                        for (int k = j + 1; k < checkList.toArray().length; k++) {
                            if (checkList.get(j) > checkList.get(k)) {
                                temp = checkList.get(k);
                                checkList.set(k, checkList.get(j));
                                checkList.set(j, temp);
                            }
                        }
                    }

                    System.out.println(checkList);
                    return;
                }
            }
        }


    }


}



/*
int형 저장할 수 있는 리스트 생성
반복적으로 정수 입력받아 리스트에 저장
숫자가 아닌 값을 입력하면 반복 종료
전체 입력받은 숫자들의 평균보다 큰 값들만 출력
 */
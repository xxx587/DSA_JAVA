package day18;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("받을 로또 번호의 수를 입력해 주세요: ");
        try {
            int count = input.nextInt();
            for (int i = 0; i < count; i++) {
                Set<Integer> lottoSet = new HashSet<>();

                while (lottoSet.size() < 6) {
                    int n = (int) (Math.random() * 45 + 1);
                    lottoSet.add(n);
                }

                List<Integer> lottoList = new ArrayList<>(lottoSet);

                Collections.sort(lottoList);

                System.out.println((i + 1) + "번째 로또: " + lottoList);
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자가 입력되지 않았습니다.");
            return;
        }

        input.close();
    }
}
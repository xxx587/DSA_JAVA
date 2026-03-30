package day5;

public class ContinueExample {
    public static void main(String[] args) {


        int sum = 0;
        int i;

        for (i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println("건너뛰었을 때의 i값 " + i);
                continue;
            }
            System.out.println("누산한 i값 " + i);
            sum += i;
        }

        System.out.println("1부터" + i + "까지의 합은 " + sum);

    }
}

package PRPR.BookPR;

public class test05_9_1 {
    int age;
    String name;
    boolean isMarried;
    String baby;

    test05_9_1(int age, String name, boolean isMarried, String baby) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
        this.baby = baby;
    }

    void person() {
        if (isMarried) {
            System.out.printf("나이가 %d살, 이름이 %s라는 남자가 있습니다. 이 남자는 결혼했고, 자식이 %s 있습니다", age, name, baby);
        } else {
            System.out.printf("나이가 %d살, 이름이 %s라는 남자가 있습니다. 이 남자는 결혼하지 않았고, 자식이 %s 있습니다", age, name, baby);
        }
    }
}
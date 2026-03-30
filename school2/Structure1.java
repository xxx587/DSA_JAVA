package school2;

public class Structure1 {
    private String name;
    private int age;

    public Structure1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "===============\n" +
                "이름: " + name + '\n' +
                "나이: " + age + '\n';
    }
}

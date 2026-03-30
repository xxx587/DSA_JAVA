package school2.answer;

import java.util.Scanner;

public class Manager {
    // 몇명을 관리할 수 있는 매니저인지
    private Person[] people;
    // 관리중인 사람의 수
    private int index;
    private Scanner scan = new Scanner(System.in);

    public Manager(int size) {
        this.people = new Person[size];
    }

    public Student makeStudent() {
        System.out.println("학생을 생성합니다.");
        String name = commonInputName();
        int age = commonInputAge();
        System.out.print("학번을 입력해주세요일단 ㅋㅋ: ");
        int studentID = scan.nextInt();
        scan.nextLine();
        return new Student(name, age, studentID);
    }

    public Teacher makeTeacher() {
        System.out.println("선생을 생성합니다.");
        String name = commonInputName();
        int age = commonInputAge();
        scan.nextLine();
        System.out.print("과목을 입력해주세요: ");
        String subject = scan.nextLine();
        return new Teacher(name, age, subject);
    }

    private int commonInputAge() {
        System.out.print("나이를 입력해주세요: ");
        return scan.nextInt();
    }

    private String commonInputName() {
        System.out.print("이름을 입력해주세요: ");
        return scan.nextLine();

    }

    public void addPerson(Person p) {
        this.people[index++] = p;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void printAll() {
        System.out.println("현재 관리중인 사람수는" + index + "명 입니다. ");
        System.out.println("앞으로" + (getPeople().length - index) + "명 더 등록 가능합니다.");
        System.out.println("명단을 출력합니다.");

        for (int i = 0; i < getIndex(); i++) {
            System.out.println(getPeople()[i]);
        }
    }

    public void searchProcess() {
        System.out.println("명부에서 검색하기");
        System.out.println("이름을 입력하세요");
        String name = scan.nextLine();
        Person p = findPerson(name);
        if (p != null) {
            System.out.println("검색결과를 출력합니다.");
            System.out.println(p);
        } else {
            System.out.println("그런사람 없는데요");
        }
    }

    public Person findPerson(String name) {
        Person p = null;
        for (int i = 0; i < getIndex(); i++) {
            if (getPeople()[i].getName().equals(name)) {
                p = getPeople()[i];
                break;
            }
        }
        return p;
    }
}

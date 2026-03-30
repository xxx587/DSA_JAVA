package school2;

public class Management {
    private Structure1[] people;
    private int index;

    public Management(int size) {
        this.people = new Structure1[size];
    }


    public void menu() {
        System.out.println("====학생 관리====");
        System.out.println("1. 학생 추가");
    }



    public void addPerson(Structure1 person) {
        if (index < people.length) {
            people[index] = person;
            index++;
        } else {
            System.out.println("정원 초과입니다.");
        }
    }

    public void printAllPersons() {
        for (int i = 0; i < index; i++) {
            System.out.println(people[i].toString());
        }
    }

    public Structure1[] getPeople() {
        return people;
    }
}

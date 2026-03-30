package school2.answer;

public class SchoolTest {
    public static void main(String[] args) {
        // 사람을 상속하는 학생 인스턴스 만들기
        // 사람을 상속하는 선생 인스턴스 만들기
        // 매니저 인스턴스 만들기

        // 사람인스턴스를 생성하는 동작을 매니저가 담당하도록 하기

        Manager m = new Manager(50);

        Student s = m.makeStudent();
        Teacher t = m.makeTeacher();
        Teacher t3 = m.makeTeacher();
        m.addPerson(s);
        m.addPerson(t);
        m.addPerson(t3);

        m.printAll();
        m.searchProcess();


        // 각자의 프로필 출력
        // 나이: 11,  이름: 22
        // 저는 강사/학생 입니다
        // 담당과목이 IT입니다./ 학번이 1111입니다.
    }
}

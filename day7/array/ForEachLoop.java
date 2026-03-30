package day7.array;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] subject = {"java", "DB", "FrontEnd"};
        //배열을 위한 향상된 forLoop
        /*
        for(자료형 각요소를가리킬변수명 : 배열 이름) {
            수행문;
        }
         */
        for (String s : subject) {
            System.out.println(s);
        } //전체 다 출력됨

        for (int i = 0; i < subject.length; i++) {
            if (i == 1) {
                System.out.println(subject[i]);
            }
        } //원하는 인덱스 값을 지정해 배열 데이터 가져오기 가능

    }
}

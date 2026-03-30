package day7.array;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] scores = {55, 60, 71, 84, 62};
        char[] grades = new char[5];

        whatGrade(scores, grades);

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }


        System.out.println("---------------");
        System.out.println(scores); //주소값 반환
        System.out.println(grades);

    }

    /**
     * 점수를 받아 등급을 출력하는 매서드 whatGrade()
     *
     * @param score
     * @return grade
     */
    public static void whatGrade(int[] score, char[] grade) {

        for (int i = 0; i < grade.length; i++) {
            if (score[i] >= 90) {
                grade[i] = 'A';
            } else if (score[i] >= 80) {
                grade[i] = 'B';
            } else if (score[i] >= 70) {
                grade[i] = 'C';
            } else if (score[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

    }
}
package day14;

import javax.swing.JFrame;

public class Test extends JFrame {
    int num;
    String name;
    static int num2;
    /*
    static
    변수: 객체의 개수와 관계없이 1개만 존재
    메소드: 객체와 관계없이 클래스명으로 호출가능
     */
    public final int num3 = 1;
    /*
    final
    변수: 값 변경 금지
    메소드: 오버라이딩 금지
    클래스: 상속 금지
     */


    public void output() {
        System.out.println("num: " + num + ", name: " + name);
    }
}

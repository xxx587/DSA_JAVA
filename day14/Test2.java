package day14;

import javax.swing.*;

public class Test2 {
    public static void main(String[] args) {
        Test t = new Test();
        t.num = 1;
        t.name = "김";
        t.output();
        t.setTitle("창 제목");
        t.setBounds(100,100,300,300);
        t.setVisible(true);

        //상속의 기능 > 코드의 재활용

        JFrame a = new Test();
        Object b = new String();
    }
}

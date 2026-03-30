package day19;

import day21.Student;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Student student= new Student();


        map.put("aaa","lasldkjf");
        map.put("bbb","asdganfad");
        map.put("ccc","asdgadb");

        System.out.println(map.get("bbb"));
        System.out.println(map.remove("ccc")); //1번 불러오고 삭제
        System.out.println(map);

        map.put("aaa", "새로운 내용"); //key aaa의 value가 바뀜
        System.out.println(map);

        //여러 종류를 저장하는 맵
        HashMap<String, Object> map2 = new HashMap<>();

        map2.put("number",100);
        map2.put("String", "문자열");
        map2.put("student", new Student("김철수", 100,80,60));
        map2.put("sb", new StringBuffer("abcdefg"));
        System.out.println(map2);
    }
}
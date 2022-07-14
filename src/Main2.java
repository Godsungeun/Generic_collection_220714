import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        // HashSet 생성
        HashSet<String> languages = new HashSet<String>();

        // HashSet에 객체 추가
        languages.add("Java");    // 1)
        languages.add("Python");
        languages.add("Javascript");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Rudy");
        languages.add("Java");  // 중복

        // 반복자 생성하여 it 에 할당
        Iterator it = languages.iterator();

        // 반복자 통해 HashSet을 순회하며 각 요소들 출력
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

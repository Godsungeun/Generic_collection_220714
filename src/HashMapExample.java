import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        //HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // Entry 객체 저장
        map.put("피카츄", 85);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 65);
        map.put("피존투", 15);

        //저장된 총 Entry 수 얻기
        System.out.println("총 entry 수: " + map.size());
        //객체 찾기
        System.out.println("파이리 : " + map.get("파이리"));

        //key 요소로 가지는 set을 생성 -> 아래에서 순회하기 위해서 필요
        //keySet() : 모든 키들을 객체에 담아서 리턴한다!
        Set<String> keySet = map.keySet();

        //keySet을 순회하며 value 읽어오기
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {//읽어올 객체 남아있는지 확인
            String key = keyIterator.next(); //객체 읽어오기
            Integer value = map.get(key); // key에 해당하는 값
            System.out.println(key + " : " + value);
        }

        // 객체 삭제
        map.remove("피존투");
        System.out.println("총 entry 수: " + map.size());

        // Entry 객체를 요소로 가지는 Set을 생성 -> 순회하기 위해
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        // entrySet을 순회하면서 value를 읽어온다
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
            // key 랑 value를 담을 변수를 각각 만들어서 출력해낸다
        }

        //객체 전체 삭제
        map.clear();
    }
}

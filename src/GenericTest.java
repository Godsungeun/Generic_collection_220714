import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30); // String을 추가

//        Integer i = (Integer)list.get(2); // 컴파일 OK
        // list.get(2) 가 원래 Object 타입을 반환함
        // object 타입을 Integer로 변환하는 것이라 컴파일은 허용한다!
        // 하지만 실행시 java.lang.ClassCastException 에러 뜬다
        // 형변환 하라는 뜻의 오류 메세지
        // ---> 컴파일러의 한계임
        // 컴파일 에러가 실행시 에러보다 낫기 때문에 컴파일 과정에서
        // 미리 차단 시켜버리는 것이 제네릭이다 ㅋㅋㅋ
        // 다른 타입이 들어오면 컴파일에러 내버림!~
        Integer a = list.get(2);
        // 그래서 위처럼 형변환을 안붙여줘도 된다!
        System.out.println(list);
        System.out.println(a);
    }
}

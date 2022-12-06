package Part_02.Chapter_06.ch05.TCP;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionStreamTest {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        // 컬렉션에서 스트림 생성
        Stream<Integer> stream = list.stream();
        // forEach() 메소드를 이용한 스트림 요소와 순차 접근
        stream.forEach(System.out::println);
    }
}

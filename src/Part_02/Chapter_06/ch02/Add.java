package Part_02.Chapter_06.ch02;

@FunctionalInterface  // 함수형 인터페이스라는 의미, 내부에 여러 개의 메서드를 선언하면 에러남, 단 하나의 메서드만을 선언해야녀
public interface Add {

    public int add(int x, int y);

}

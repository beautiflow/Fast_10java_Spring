package Part_02.Chapter_05.ch07;

public class GenericPrinter <T>{

    private T material; // T 자료형으로 선언한 변수

    public T getMaterial() {  // T 자료형을 반환하는 제네렉 메서드
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString(){
        return material.toString();
    }
}

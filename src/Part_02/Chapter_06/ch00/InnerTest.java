package Part_02.Chapter_06.ch00;

class OutClass{

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
      inClass = new InClass();  // 내부 클래스 생성
    }

    class InClass{

        int iNum = 100;

        void inTest(){

            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

    public void usingClass(){
        inClass.inTest();   //내부 클래스 변수를 사용하여 메서드 호출하기
    }

    static class InStaticClass {

        int iNum = 100;
        static int sInNum = 200;

        void inTest(){

            System.out.println("OutClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass sNum = " + sInNum + "(내부 클래스의 인스턴스 변수)");
        }

        static void sTest(){

            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass sNum = " + sInNum + "(내부 클래스의 인스턴스 변수)");
        }

    }
}


public class InnerTest {
    public static void main(String[] args) {


//        OutClass outClass = new OutClass();
//        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
//        outClass.usingClass(); // 내부 클래스 기능 호출
//
//        System.out.println();
//
//        OutClass.InClass inner = outClass.new InClass();  // 외부 클래스를 이용하여 내부 클래스 생성
//        System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
//        inner.inTest();


        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        System.out.println();

        OutClass.InStaticClass.sTest();
    }
}

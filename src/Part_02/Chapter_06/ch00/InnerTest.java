package Part_02.Chapter_06.ch00;

class OutClass{

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
      inClass = new InClass();
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
        inClass.inTest();
    }
}


public class InnerTest {
    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        outClass.usingClass();

        System.out.println();

        OutClass.InClass inner = outClass.new InClass();
        inner.inTest();

    }
}

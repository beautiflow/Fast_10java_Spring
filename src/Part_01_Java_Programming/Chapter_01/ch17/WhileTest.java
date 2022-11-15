package Part_01_Java_Programming.Chapter_01.ch17;

public class WhileTest {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0; // 지역변수는 반드시 초기화를 해줘야 함.

        while(num <= 10){
            sum += num;
            num++;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}

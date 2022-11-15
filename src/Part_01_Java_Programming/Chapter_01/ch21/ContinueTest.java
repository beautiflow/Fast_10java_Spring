package Part_01_Java_Programming.Chapter_01.ch21;

public class ContinueTest {
    public static void main(String[] args) {

        int num;

        for( num = 1; num <= 100; num++){

            if((num % 3) != 0) continue;

            System.out.println(num);
        }
    }
}

package Part_01_Java.Chapter_01.ch18;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input;
        int sum = 0;

        input = scanner.nextInt();

        while( input != 0 ){

            sum += input;
            input = scanner.nextInt();
        }
        System.out.println(sum);
    }
}

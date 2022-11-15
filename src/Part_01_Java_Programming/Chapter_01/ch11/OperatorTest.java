package Part_01_Java_Programming.Chapter_01.ch11;

public class OperatorTest {
    public static void main(String[] args) {

        int gameScore = 150;

        int lastScore = gameScore++; // gameScore += 1; gameScore = gameScore +1;
        // int lastScore = ++gameScore;
        // int lastScore = gameScore--;
        // int lastScore = --gameScore;

        System.out.println(lastScore);
        System.out.println(gameScore);
    }
}

/*
 *  val = ++num; // 먼저 num 값이 1 증가한 후 val 변수에 대입
 *  val = num++; // val 변수에 기존 num 값을 먼저 대입한 후 num 값 1 증가
 *
 *  val = --num; // 먼저 num 값이 1 감소한 후 val 변수에 대입
 *  val = num--; // val 변수에 기존 num 값을 먼저 대입한 후 num 값 1 감소
 */


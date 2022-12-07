package Part_02.Chapter_06.ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream3 {
    public static void main(String[] args) {

        int i;
        try (FileInputStream fis = new FileInputStream("/Users/beautiflow/workspace/Fast_10java_Spring/src/Part_02/Chapter_06/input2.txt")){

            byte[] bs = new byte[10];

            while (( i = fis.read(bs)) != -1){

                for(int j=0; j<i; j++){
                    System.out.print((char)bs[j]);
                }
                System.out.println(" : " + i + "바이트 읽음");
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

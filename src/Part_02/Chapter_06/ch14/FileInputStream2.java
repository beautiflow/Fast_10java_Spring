package Part_02.Chapter_06.ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream2 {
    public static void main(String[] args) {

        int i;
        try (FileInputStream fis = new FileInputStream("/Users/beautiflow/workspace/Fast_10java_Spring/src/Part_02/Chapter_06/input.txt")){

            while ((i = fis.read()) != -1){
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

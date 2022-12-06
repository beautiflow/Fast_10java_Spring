package Part_02.Chapter_06.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("/Users/beautiflow/workspace/Fast_10java_Spring/src/Part_02/Chapter_06/a.txt");
            System.out.println("read");
        } catch (FileNotFoundException e) {
            System.out.println(e);
         }finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finally");
        }
        System.out.println("end");
    }
}

package Part_02.Chapter_06.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className);
        return c;
    }





    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("/Users/beautiflow/workspace/Fast_10java_Spring/src/Part_02/Chapter_06/a.txt", "java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("end");

    }
}
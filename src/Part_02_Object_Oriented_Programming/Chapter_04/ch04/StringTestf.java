package Part_02_Object_Oriented_Programming.Chapter_04.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String");

        Constructor[] cons =  c.getConstructors();
        for(Constructor co : cons){
            System.out.println(co);
        }

        System.out.println();

        Method[] m = c.getMethods();
        for(Method mth : m){
            System.out.println(mth);
        }
    }
}

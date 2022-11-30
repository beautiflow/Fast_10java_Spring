package Part_02.Chapter_04.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTestf {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String");

        System.out.println("------------------getConstructors() 메서드------------------");

        Constructor[] cons =  c.getConstructors();
        for(Constructor co : cons){
            System.out.println(co);
        }

        System.out.println(" ");
        System.out.println("------------------getMethods() 메서드------------------");

        Method[] m = c.getMethods();
        for(Method mth : m){
            System.out.println(mth);
        }
    }
}

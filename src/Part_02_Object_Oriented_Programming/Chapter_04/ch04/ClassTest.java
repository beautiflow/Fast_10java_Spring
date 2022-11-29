package Part_02_Object_Oriented_Programming.Chapter_04.ch04;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

        Class c1 = Class.forName("Part_02_Object_Oriented_Programming.Chapter_04.ch04.Person");

        Person person = (Person) c1.newInstance();
        person.setName("Lee");
        System.out.println(person);

        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();   //getdeclaredconstructor().newinstance 붙여서 호출
        System.out.println(p);

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person kimPerson = (Person) cons.newInstance(initargs);
        System.out.println(kimPerson);

        Person kim2 = new Person("Kim");


//    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
//            ClassNotFoundException, NoSuchMethodException, SecurityException {
//        Person person = new Person("James");
//        System.out.println(person);
//
//        Class c1 = Class.forName("ch04.Person");
//        Person person1 = (Person)c1.newInstance();
     //   Person person1 = (Person)c1.instance();
//        System.out.println(person1);
//
//        Class[] parameterTypes = {String.class};
//        Constructor cons = c1.getConstructor(parameterTypes);
//
//        Object[] initargs = {"김유신"};
//        Person personLee = (Person)cons.newInstance(initargs);
//        System.out.println(personLee);
//
//    }
    }
}

package Part_02_Object_Oriented_Programming.Chapter_04.ch03;

public class StringTest1 {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);
    }

}

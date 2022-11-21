package Part_02_Object_Oriented_Programming.Chapter_02.ch18;

import java.util.PrimitiveIterator;

public class Company {

    private static Company instance = new Company();

    private Company (){

    }

    public static Company getInstance(){
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }


}

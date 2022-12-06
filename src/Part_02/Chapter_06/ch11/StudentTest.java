package Part_02.Chapter_06.ch11;

public class StudentTest {
    public static void main(String[] args) {

        MyLogger myLogger = MyLogger.getLogger();

        String name = null;
        try{
            Student student = new Student(name);
        }catch (StudentNameFormatException e){
            myLogger.warning(e.getMessage());
        }

        try {
            Student Student = new Student("Edward Jon Kim Test");
        }catch (StudentNameFormatException e){
            myLogger.warning(e.getMessage());
        }

        Student student = new Student("James");
    }

}

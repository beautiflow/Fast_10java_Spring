package Part_02_Object_Oriented_Programming.Chapter_02.ch10;

public class BirthDayTest {
    public static void main(String[] args) {

        BirthDay date = new BirthDay();
        date.setYear(2019);
        date.setMonth(12);
        date.setDay(30);

        // date.month = 100;

        date.showDate();
    }
}

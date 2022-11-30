package Part_02.Chapter_02.ch15;

public class TakeTransTest {
    public static void main(String[] args) {

        Person personE = new Person("Edward", 20000);

        Taxi wellTaxi = new Taxi("잘나간다 운수");
        personE.takeTaxi(wellTaxi);

        personE.showInfo();
        wellTaxi.showTaxiInfo();

    }
}

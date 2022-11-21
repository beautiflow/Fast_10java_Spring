package Part_02_Object_Oriented_Programming.Chapter_02.ch15;

public class Taxi {

    String taxiName;
    int money;

    public Taxi(String taxiName){
        this.taxiName = taxiName;
    }

    public void take(int money){
        this.money += money;
    }

    public void showTaxiInfo(){
        System.out.println(taxiName + "택시 수입은 " + money + "원 입니다.");
    }
}
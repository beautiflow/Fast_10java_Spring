package Part_02_Object_Oriented_Programming.Chapter_03.ch02;

public class VIPCustomer extends Customer{

    double salesRatio;
    private String agentID;

    public VIPCustomer(){

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentID(){
        return agentID;
    }
}

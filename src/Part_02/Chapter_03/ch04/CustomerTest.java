package Part_02.Chapter_03.ch04;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");

        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + price + "원 입니다.");

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");

        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(10000);
        System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + price + "원 입니다.");


        Customer vc = new VIPCustomer(12345, "noname");
        System.out.println(vc.calcPrice(1000));

        Customer customerNo = new VIPCustomer(10030, "나몰라");
        customerNo.bonusPoint = 10000;
        price = customerNo.calcPrice(10000);
        System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + price + "원 입니다.");
    }
}

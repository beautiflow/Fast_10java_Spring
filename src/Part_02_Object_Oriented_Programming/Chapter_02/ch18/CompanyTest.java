package Part_02_Object_Oriented_Programming.Chapter_02.ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();
        // static 인 경우에는 클래스 이름으로 가져다가 사용해야 한다.

        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();

    }
}

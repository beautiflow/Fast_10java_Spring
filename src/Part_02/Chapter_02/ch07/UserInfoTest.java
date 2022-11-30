package Part_02.Chapter_02.ch07;

public class UserInfoTest {
    public static void main(String[] args) {

        // 생성자가 2개이기 때문에 2가지 방법으로 사용을 했다.
        // 하나는 디폴트사용자를 이용을 해서 각각의 변수 값을 넣는 방법

        UserInfo userLee = new UserInfo();
        userLee.userId = "a12345";
        userLee.userPassWord = "zxcvbn12345";
        userLee.userName = "Lee";
        userLee.phoneNumber = "01034556699";
        userLee.userAddress = "Seoul, Korea";

        System.out.println(userLee.showUserInfo());

        // 다른 하나는 생성을 할 때 매개변수를 직접 넣어서 하는 코드를 만드는 방법
        UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kim");
        System.out.println(userKim.showUserInfo());
    }
}

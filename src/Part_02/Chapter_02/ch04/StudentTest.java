package Part_02.Chapter_02.ch04;

public class StudentTest {
    public static void main(String[] args) {

        int num = 10;
        Student studentLee = new Student(); // 생성자는 힙이라는 메모리에 인스턴스가 생성이 된다.

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();
        System.out.println(studentKim);
        System.out.println(studentLee);
    }
}

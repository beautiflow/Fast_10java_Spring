package Part_02.Chapter_02.ch24;

/*
 * 1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다.
 * Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
 * Lee 학생은 국어 100점, 수학 50점입니다.
 * Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다.
 * Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요
 */

import java.util.ArrayList;

public class Student {

    int studentId;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total = 0;

        for(Subject s : subjectList){

            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
        }

        System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
    }
}

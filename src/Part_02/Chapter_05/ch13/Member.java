package Part_02.Chapter_05.ch13;

import java.util.Comparator;

public class Member implements Comparator<Member> {

    private int memberId; // 회원 아이디
    private String memberName; // 회원 이름

    public Member() {

    }

    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public boolean equals(Object obj) {

        if( obj instanceof Member){

            Member member = (Member) obj;
            if(this.memberId == member.memberId){
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public String toString(){ // toString 메소드 오버로딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

//    @Override
//    public int compareTo(Member member) {
//
//        if( this.memberId > member.memberId){
//            return 1;}
//        else if(this.memberId < member.memberId){
//            return -1;}
//        return 0;  // 오름차순 // 내림차순으로 표현하려면 1과 -1만 위치 변경하기

        // return (this.memberId - member.memberId); // 오름차순
        // return (this.memberId - member.memberId) * (-1); // 내림차순

    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberId - member2.memberId);
    }

    }


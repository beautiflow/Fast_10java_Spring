package Part_02.Chapter_05.ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashSet; // ArrayList 선언

    public MemberHashSet(){
        hashSet = new HashSet<Member>();  // 멤버로 선언한 ArrayList 생성
    }

    public void addMember(Member member){  // ArrayList 에 멤버 추가
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){ // 멤버 아이디를 매개변수로, 삭제 여부를 반환

       /* for(int i = 0; i<hashSet.size(); i++){  // 해당 아이디를 가진 멤버를 ArrayList 에서 찾음
            Member member = hashSet.get(i);

            int tempId = member.getMemberId();
            if(tempId == memberId){  // 멤버아이디가 매개 변수와 일치하면
                hashSet.remove(i);  // 해당 멤버를 삭제
                return true;          // true 반환
            }
        }*/

        Iterator<Member> ir = hashSet.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){         // 멤버아이디가 매개변수와 일치하면
                hashSet.remove(member);   // 해당 멤버를 삭제
                return true;                // true 반환
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다."); // for 가 끝날 때까지 return이 안된 경우
        return false;
    }

    public void showAllMember(){

        for(Member member : hashSet){
            System.out.println(member);
        }
        System.out.println();
    }
}

package co.edu.compound;

//public은 접근제한자 설정하는것 public class는 누구나 외부에서 수정을 가능하다
//private class를 사용하면 외부 접근자를 막을 수 있음.
public class FriendMain {
	public static void main(String[] args) {
		// f1이라는 변수 선언하여 친구의 정보를 담아보자
//		"김준형", "010-487-7895", "naver@naver.com", "7월 6일", -157, 61.5
		Friend f1 = new Friend();
		f1.setName("김누구");
		f1.setTell("010-1234-5678");
		f1.setHeight(-167.7);
		f1.setWeight(-56);
		
		f1.showInfo();
		System.out.print("이름: " + f1.getName() + "\n키 : " + f1.getHeight() + "cm" + ", 몸무게 : " +
					f1.getWeight() +"kg" + "\n전화번호 : " + f1.getTell());
	}

}

package Exception0711;

/*
 * 익스턴스를 담고있는 참조변수 = null일때 발생하는 예외
 */
public class NullpointerEx {
	public static void main(String[] args) {
		
		String name = "홍길동";
		name = null;
		
		try {
//		name이라는 주소값을 따라갔을 때 "홍길동"이 출력되는것
		System.out.println(name.toString());
//		name에 null값을 주면 주소값에 담긴게 없어서 nullPointerException오류 발생
//		이때 try catch 구문 사용한다
		System.out.println("name 을 출력합니다.");
		
		} catch (NullPointerException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
//			ㄴ어느 위치에서 에러가 발생했는지 알 수 있는 명령어
		}
		System.out.println("프로그램 종료");
	}

}

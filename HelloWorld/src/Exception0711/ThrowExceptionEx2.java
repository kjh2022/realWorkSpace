package Exception0711;

public class ThrowExceptionEx2 {
	public static void main(String[] args) {

		String[] str = { "100", "200", "300", "400" };
		try {
			subMethod(str);
		} catch (NumberFormatException e) {
			System.out.println("예외종류: NumberFormat 예외.");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("예외종류: 배열의 범위 초과 예외.");

		} catch (Exception e2) {
			System.out.println("그 외 예외: 알 수 없는 예외");
		} finally {
//			정상적인 실행 or 예외 발생에 관계없이 반드시 실행할 코드는 finally를 사용해 작성
			System.out.println("프로그램의 정상 종료");
		}
		
		System.out.println("프로그램 종료");
	}

	public static void subMethod(String[] strAry) //
			throws NumberFormatException, ArrayIndexOutOfBoundsException {

		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(strAry[i]);
			System.out.println(num);
		}
	}

}

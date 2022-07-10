package co.eeu;

public class example03 {
	public static void main(String[] args) {
		// switch문을 이용하여 월 정보 입력 -> 마지막 날이 28, 30, 31일이라는 정보를 출력해주는 프로그램 짜보기
		int month = (int) (Math.random() * 12) + 1;
		System.out.println(month);

		int lastDate = -1;
/*		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12) {
			lastDate = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			lastDate = 30;
		} else {
			lastDate = 28;
		}
*/
		switch (month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDate = 31; break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDate = 30; break;
		default :
			lastDate = 28;
		}
		System.out.println(month + "월의 마지막 날은 " + lastDate + "일 입니다. ");

	}

}

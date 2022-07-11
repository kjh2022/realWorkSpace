package co.edu0711;

//정수를 담을 수 있는 6개 배열
//1~100까지 임의의 값을 6개 담기
public class MorningEx2 {
	public static void main(String[] args) {
		int[] intAry = new int[6];
		//최대
		int max = intAry[0];
		int sum = 0;
		double avg = 0;
		
		
		for(int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 45 + 1);
			if (intAry[i] == 8) {
				max = intAry[i];
				System.out.println("찾으시는 값 " + max + "이 나왔습니다.");
				break;
			}
		}
		avg = (double) sum / intAry.length;
		System.out.println("6자리 평균 값: " + avg);
		
		
		//확장 for
		for(int num : intAry) {
			System.out.print(num + " ");
		}
		
	}

}

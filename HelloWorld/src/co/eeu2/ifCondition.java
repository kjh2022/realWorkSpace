package co.eeu2;

public class ifCondition {
	public static void main(String[] args) {
		int num = 6;
		
		//if else 구문 만들기
/*		if(num % 2 == 0) {
			System.out.println(num + "은(는) 짝수입니다.");
		} else {
			System.out.println(num + "은(는) 홀수입니다.");
		}

	*/	//if ~else if ~else
	//	if(num % 2 == 0 && num %3 == 0) {
	//	}
		
		if(num % 2 == 0 && num %3 == 0) {
		System.out.println("은(는) 2와 3의 배수입니다.");
		} else if (num % 3 == 0){
			System.out.println("3의 배수입니다.");
		} else if (num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}else {
		System.out.println("2 또는3의 배수가 아닙니다.");
		}
		
		int score = 88;
		String grade = "";
		// 100 ~90 -> A, 89~80 => B, 79~70 => C, 그 외 D가 나오게
		if(score >=90 && score <= 100) {
			grade = "A";
		}else if (score >= 80 /* && score <= 89*/) {
			grade = "B";
		}else if (score >= 70 /* && score <= 79*/) {
			grade = "C";
		}else {
			grade = "D";
		}
		System.out.println(score +"은(는) "+ grade + "입니다.");
	}
}

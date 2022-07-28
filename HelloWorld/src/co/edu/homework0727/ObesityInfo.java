package co.edu.homework0727;

//3) ObesityInfo 클래스를 정의한다. o
//- StandardWeightInfo 클래스를 상속한다. o
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//(2) public double getObesity() : 비만도를 구하는 기능
//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
//
//4) 아래와 같은 출력결과가 나오도록 실행코드를 구현하다.
//- 출력결과
//홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
//박둘이님의 신장 168, 몸무게 90, 비만입니다.
//- 조건
//변수는 Human 클래스 타입으로 선언하여 하나만 사용한다.
public class ObesityInfo extends StandardWeightInfo {
	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	public static void main(String[] args) {
		Human human = new StandardWeightInfo("홍길동", 168, 45);
		human.getInformation();
		human =  new ObesityInfo("박둘이", 168, 90);
		human.getInformation();
	}
	
	public String fat(double obesity) {
		String result;
		if (obesity < 20) {
			result = "정상 체중입니다.";
		} else if (obesity < 28) {
			result = "과체중입니다.";
		} else {
			result = "비만입니다.";
		}
		return result;
	}

	public void getInformation() {
		System.out.printf("\n%s님의 신장 %.0f, 몸무게 %.1f, %s", getName(), getHeight(), getWeight(), fat(getObesity()));
	}

	public double getObesity() {
		return (super.getWeight() - getStandardWeight()) / getStandardWeight() * 100;
	}
}

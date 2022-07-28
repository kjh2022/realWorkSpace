package co.edu.homework0727;

//- Human 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//(2) public double getStandardWeight() : 표준체중을 구하는 기능
//( * 표준 체중 : (Height - 100) * 0.9 )
public class StandardWeightInfo extends Human {
	public StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	
	public double getStandardWeight() {
		return (getHeight() - 100) * 0.9;
	}
	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %.0f, 몸무게: %.0f, 표준 체중: %.1f 입니다.", getName(), getHeight(), getWeight(), getStandardWeight() );
	}

}

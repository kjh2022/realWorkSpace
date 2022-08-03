package co.edu.homework0727;

//- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
public class Human {
	private String name;
	private double height;
	private double weight;

	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void getInformation() {
		System.out.printf("이름: %s, 키: %.1f 몸무게: %.1f", name, height, weight);
	}
}
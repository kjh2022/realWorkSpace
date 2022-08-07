package practice;

/*연습용 삭제필*/
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
		System.out.printf("이름: %s, 키: %.1f, 몸무게: %.1f,", //
						  name, height, weight);
	}

}

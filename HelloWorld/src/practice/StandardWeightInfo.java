package practice;

public class StandardWeightInfo extends Human {

	public StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	public double getStandardWeight() {
		return (getHeight() - 100) * 0.9;
	}

	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %.0f, 몸무게 %.0fkg, 표준 체중 %.1fkg입니다.", //
				getName(), getHeight(), getWeight(), getStandardWeight());
	}

}

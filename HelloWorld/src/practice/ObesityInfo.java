package practice;

public class ObesityInfo extends StandardWeightInfo {

	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	public static void main(String[] args) {
		Human human = new StandardWeightInfo("홍길동", 168, 45);
		human.getInformation();
		human = new ObesityInfo ("박둘이", 168, 88);
		human.getInformation();
	}
	
	public String fat(double obesity) {
		String result;
		if (obesity < 20) {
			result = "정상 체중입니다.";
		} else if (obesity < 28) {
			result = "과체중입니다.";
		}else {
			result = "비만입니다.";
		}
		return result;
	}

	@Override
	public void getInformation() {
		System.out.printf("\n%s님의 신장 %.0fcm, 몸무게 %.0fkg, %s", //
				getName(), getHeight(), getWeight(), fat(getObesity()));
	}
	public double getObesity() {
		return (super.getWeight() - getStandardWeight()) / getStandardWeight() * 100;
	}
}

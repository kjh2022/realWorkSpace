package co.edu.inherit0708;

/*extends(상속) 명령어로 cellphone라는 부모 클래스 선택
 * 상속 : 자식이 부모를 선택
 */
public class DmbCellPhone extends CellPhone {
	private int channel;

	public DmbCellPhone() {
		super();//
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); // 부모에게 있는 기능이므로 super로 기능을 불러와야함
		this.channel = channel;
	}

	public void turnOn() {
		System.out.println("dmb 화면 on");
	}

	public void turnOff() {
		System.out.println("dmb화면 off");
	}

// 	overriding : 재정의 우클릭, 소스, 오버라이딩
	@Override // 없어도 상관없지만 타입체크를 해주기때문에 두면좋을듯ㅎ
	public void bell() {
		super.bell();
		System.out.println("벨이 울립니다.");
	}

	@Override
	public String toString() {
		return "model명은 " + getModel() + ", 색상은 " + getColor() + ", 채널은 " + channel +  "입니다.";
	}
	

}

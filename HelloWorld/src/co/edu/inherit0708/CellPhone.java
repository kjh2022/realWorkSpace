package co.edu.inherit0708;
/* 부모요소
 * 상속(부모 <- 자식 : 자식이 부모에게로)
 * cellPhone(통화만 가능한 휴대전화) <- dmbCellPhone (dmb기능이 추가된 휴대전화)
 */

public class CellPhone {
	private String model;
	private String color;

//	생성자 초기화
	public CellPhone() {} // default constructor

	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	public void bell() {
		System.out.println("bell");
	}

	public void sendVoice() {
		System.out.println("메시지 전송");
	}

	public void receiveVoice() {
		System.out.println("메시지 수신");
	}
//	get, set 메소드 생성

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "model명은 " + model + ", 색상은 " + color + "입니다.";
	}

	
}

package co.edu.inherit0708;

public class MainExample {
	public static void main(String[] args) {

		DmbCellPhone phone = new DmbCellPhone(); // 생성자 만들기
		phone.setModel("AnyCall");
		phone.setColor("white");
		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoice();

		phone.turnOn();
		phone.turnOff();

		phone.powerOff();

		// smartphone 기능
		SmartPhone sphone = new SmartPhone();
		sphone.setModel("Galaxy");
		sphone.setColor("black");

		sphone.powerOn();
		sphone.powerOff();

		System.out.println("자동형변환>>>>>> ");
		// 부모 > 자식이지만, 부모 클래스에 다시 자식클래스를 담을 수 있다
		CellPhone dphone = new DmbCellPhone("i-phone", "red", 100);
		System.out.println(dphone.toString());
		CellPhone cphone = new CellPhone();
		cphone.setModel("HelLG");
		cphone.setColor("지옥불반도 컬러");
		System.out.println(cphone.toString());

		if (dphone instanceof DmbCellPhone) {

			DmbCellPhone dcp = (DmbCellPhone) dphone; // 이렇게 하면 컴파일 오류는 없지만 실행시 오류가 생김
			dcp.powerOn();
			dcp.turnOn(); // 자식의 기능은 사용불가
			dcp.powerOff();
		}
	}

}

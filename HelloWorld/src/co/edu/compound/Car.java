package co.edu.compound;

//현실에 존재하는 자동차라는 오브젝트를 자바의 세계로 옮겨놓은것이 클래스(class}
public class Car {
	// 속성들을 표현하는 클레스 " 필드 "
	String model;
	int price;
	int maxSpeed;
	int speed;
	double weight;
	double width; // 자동차의 너비(전고)

	// 생성자 : 초기값 지정
	public Car() {
		System.out.println("생성자가 호출되었습니다.");
//		maxSpeed = 200;
	}

	public Car(String model, int maxSpeed) {
		this.model = model; // 이렇게 해야 차량마다 최고속도를 지정할 수 있다.
		this.maxSpeed = maxSpeed;
	}

	// 동작 : 메소드
	public void setSpeed(int speed) {
		this.speed = speed; // 변수 이름이 필드 이름과 똑같은 경우 변수가 더 우선순위가 된다
	}

	public void showSpeed() {
		System.out.println("현재 속도는 " + speed + "km/h 입니다.");
	}

	public void run() {
		System.out.println(model + "가 달립니다.");
	}

	public void start() {
		System.out.println(model + "가 출발합니다.");
	}

	public void stop() {
		System.out.println(model + "가 멈춥니다.");
	}

	// 이렇게 선언한 후 다른 클래스에서 꺼내 사용 가능함.
}

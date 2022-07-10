package co.edu.compound;

//친구의 이름, 전화번호, 이메일, 생일, 키, 몸무게를 담기 ??
public class Friend {
	//필드 저으이, 필드의 명명규칙(소문자로 시작, 두번째 단어의 첫번째 글자는 대문자로, 영문이 먼저 와야함, 특수문자 자제
	private String name;
	private String tell;
	private String email;
	private String birth;
	private double height;
	private double weight;
	
	public Friend() {
		
	}
	
//	public Friend() {
//		String names, String tell, String email, String birth, double height, double weight 
//		this.name = names;
//		this.tell = tell;
//		this.email = email;
//		this.birth = birth;
//		this.height= height;
//		this.weight = weight;
//	}
	public void showInfo() {
		System.out.println();
//		("이름: %s, 전화번호: %s\n이메일: %s, 생일%s\n키%.1fcm, 몸무게 %.1fkg 입니다. ",
//							name, tell, email, birth, height, weight );
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height < 0) {
			System.out.println("잘못된 값이 입력되었습니다.");
			this.height = 165.0;
		}else {
			this.height = height;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
		if(weight < 0) {
			System.out.println("잘못된 값이 입력되었습니다.");
			this.weight = 60.0;
		}else {
			this.weight = weight;
		}
	}

	
}

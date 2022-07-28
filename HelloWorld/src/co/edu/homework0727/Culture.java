package co.edu.homework0727;

//1) Culture 클래스를 정의한다.o
//- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.o
//- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다. o
//- 메소드는 다음과 같이 정의한다.
//(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능 o
//(2) public String getGrade() : 평점을 구하는 기능 o
//(3) public abstract void getInformation() : 정보를 출력하는 추상메소드 o
public abstract class Culture {
	private String title;
	private int pd;
	private int actor;
	private int pop;
	private int tscore;

	public Culture(String title, int pd, int actor) {
		this.title = title;
		this.pd = pd;
		this.actor = actor;
	}

	public int getPd() {
		return pd;
	}

	public String getTitle() {
		return title;
	}

	public int getActor() {
		return actor;
	}

	public int getPop() {
		return pop;
	}

	public int getTscore() {
		return tscore;
	}

	public void setTotalScore(int score) {
		pop++;
		tscore += score;
	}

	public String getGrade() {
		String star = "";
		double grade = (double)tscore / pop;
		for(int i=1; i <= grade; i++) {
			star += "☆";
		}
		if(grade > 4.5 ) {
			star = "☆☆☆☆☆";
		}
		return star;
		//☆로 나가야함
	}

	public abstract void getInformation();
}


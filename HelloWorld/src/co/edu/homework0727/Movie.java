package co.edu.homework0727;

// 2)movie 클래스 생성
//- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public abstract void getInformation() :
//제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
public class Movie extends Culture {
	
	
	private String genre;
	
	public Movie(String title, int pd, int actor, String genre) {
		super(title, pd, actor);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public void getInformation() {
		System.out.printf("제목: %s(장르: %s)\n 감독: %d\n 배우:%d\n 영화총점: %d\n 영화평점: %s\n",//
				getTitle(),genre , getPd(),getActor(), getTscore(), getGrade());
	}

}

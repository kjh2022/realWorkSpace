package co.edu.homework0727;
//3) Performance 클래스를 정의한다.
//- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
public class Performance extends Culture{
//	필드
	private String genre;
//	생성자
	public Performance(String title, int pd, int actor, String genre) {
		super(title, pd, actor);
		this.genre = genre;
	}

	@Override
	public void getInformation() {
		System.out.printf("제목: %s(장르: %s)\n 감독: %d\n 배우:%d\n 공연총점: %d\n 공연평점: %s\n",//
				getTitle(),genre , getPd(),getActor(), getTscore(), getGrade());
	}
	


}

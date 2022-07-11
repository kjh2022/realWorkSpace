package co.edu.api0711;

public class StringText {
	public static void main(String[] args) {
//		자바를 포함한 문자열 출력 총4개
		String[] str = { "자바", "자바다", "이것이자바다", "자바스크립트", "자 바" };

		int cnt = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].indexOf("자바") != -1) {
				cnt++;
			}
		}
		System.out.println("자바 문자가 포함된 배열 요소" + cnt);

//		파일의 확장자, 파일명 구분하여 출력시키기
		String path = "c/images/Hello.png";
		int fromInd = path.lastIndexOf("/");
		int toInd = path.indexOf(".");
		System.out.println("파일명: " + path.substring((fromInd + 1), toInd));
		System.out.println("확장자: " + path.substring(toInd + 1));

//		tel에 031-2103-3478 넣어보기
		String tel = "";
		String[] tels = { " 031", " 210 3", " 34 78" };
		tel = tels[0].trim() + "-" + tels[1].trim().replace(" ", "") + //
				"-" + tels[2].trim().replace(" ","");
		System.out.println(tel);

//		checkGender로  남자입니다 여자입니다 구분하는 메소드 완성시키기
		String[] ssn = { "970403-1234123", "010503 3456123", //
				"980712/2412345", "0202023217891" };
		for (int i = 0; i < ssn.length; i++) {
			checkGender(ssn[i]);
		}
	}

	public static void checkGender(String ssn) {
		String[] str = ssn.split("");
		String replaceSsn = "";
		for (int i = 0; i < str.length; i++) {
			replaceSsn += str[i].replace("-", "").replace("/", "").replace(" ","");
		}
		char sex = replaceSsn.charAt(6);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
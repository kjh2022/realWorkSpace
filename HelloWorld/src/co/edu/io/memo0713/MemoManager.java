package co.edu.io.memo0713;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 등록, 조회, 삭제, 목록
 */
public class MemoManager {
	List<Memo> memoStorage = new ArrayList<>(); // 컬렉션 선언
	Scanner scan = new Scanner(System.in);
	File file = new File("C:/Dev/Memo.dat");

//	singleton방식
	private static MemoManager instance = new MemoManager();

	private MemoManager() {
		// 파일 정보 => ArrayList를 불러오는기능 추가 (제일밑에)
		readFromFile();
	} // 외부의 접근을 막음

	public static MemoManager getInstance() {
		return instance;
	}

//	등록
	public void InputData() {
		System.out.println("메모 번호 등록> ");
		int no = Integer.parseInt(scan.nextLine()); //
		System.out.println("작성 날짜 입력> ");
		String date = scan.nextLine();
		System.out.println("내용 입력> ");
		String content = scan.nextLine();

		memoStorage.add(new Memo(no, date, content)); // Memo 클래스에서 생성자를 정의 해놔서 이렇게 사용 가능
	}
	

//	날짜 입력하고 모든 메모 출력.
	public void search() {
		System.out.println("날짜를 입력하세요> ");
		String memoDate = scan.nextLine();

		boolean isExist = false; // 해당 날짜의 메모가 있는지 없는지 체크해주는 변수

		for (int i = 0; i < memoStorage.size(); i++) {
			if (memoDate.equals(memoStorage.get(i).getDate())) {
				System.out.println(memoStorage.get(i).toString());
				isExist = true;
			}
		}
		if (!isExist)
			System.out.println("해당 날짜의 메모가 없습니다.");
	}

//	번호 입력 -> 삭제
	public void deleteData() {
		System.out.println("삭제할 메모의 번호를 입력하세요> ");
		int delNo = Integer.parseInt(scan.nextLine());
		Iterator<Memo> iter = memoStorage.iterator();
		while (iter.hasNext()) {
			Memo memo = iter.next();
			if (memo.getNo() == delNo) {
				iter.remove();
				System.out.println("삭제되었습니다.");
				return;
			}
		}
		System.out.println("일치하는 번호가 없습니다.");

	}

//	프로그램 종료
	public void storeToFile() { //
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// 객체를 처리해주는 보조스트림, 출력이면 OS : ArrayList를 byte배열로 변경해주는 보조스트림이다.
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(memoStorage);
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//파일 정보를 들고와서 컬렉션 타입 생성

	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			memoStorage = (List<Memo>) ois.readObject();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
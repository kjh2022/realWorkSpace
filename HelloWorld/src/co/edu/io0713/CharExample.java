package co.edu.io0713;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CharExample {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			char[] cbuf= new char[10];
			int buf = 0;
			while ((buf = fr.read(cbuf)) != -1) {
				for (int i = 0; i<buf; i++) {
					System.out.print(cbuf[i]);
				}
				System.out.println();
				System.out.println();
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행완료.");
	}
//	읽기 파일 생성
	public static void reader1() {
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			while (true) {
				int buf = fr.read();
				if (buf == -1) {
					break;
				}
				System.out.print((char) buf);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

	public static void write1() {

//	쓰기 용도 파일 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("텍스트를 입력하세요> ");
		String txt = "";
		try {
			FileWriter fw = new FileWriter("c:/Dev/test2.txt");
			while (true) {
				try {
					txt = scan.nextLine();
				} catch (NoSuchElementException e) {
					break;
				}
				fw.write(txt + "\n");
			}
			fw.flush();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
		scan.close();
	}
}

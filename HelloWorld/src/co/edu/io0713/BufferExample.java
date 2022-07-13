package co.edu.io0713;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 보조 스트림 생성 바이트 기반 ->문자 기반(IntputStreamReader, OutputStreamWriter)
 * 				버퍼 스트림(내부적으로 버퍼를 가지고 있어서 읽고 쓰는 작업의 성능을 향상시켜줌)
 */
public class BufferExample {
	public static void main(String[] args) {
		bufferReaderWriter();
	}

//	버퍼 스트림
	public static void bufferReaderWriter() {
		try {
			FileInputStream fis = new FileInputStream("C:/Dev/image.png"); // 기본 입력 스트림
			BufferedInputStream bis = new BufferedInputStream(fis); // 보조

			FileOutputStream fos = new FileOutputStream("C:/Dev/buffer.png");
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			while (true) {
				int bt = bis.read();
				if (bt == -1) {
					break;
				}
				bos.write(bt);
			}
			bos.flush();
			bos.close();
			bis.close();
			fis.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행완료");
	}

	public static void streamToReader() {
		InputStream is = System.in; // 키보드 입력(키보드가 출발지)
		InputStreamReader isr = new InputStreamReader(is);
		char[] cbuf = new char[10];
		System.out.println("입력> ");
		try {
			int b = isr.read(cbuf);
			for (int i = 0; i < b; i++) {
				System.out.print((char) cbuf[i]);
				isr.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

	public static void streamToWriter() {

		// byte 단위의 스트림을 문자 기반의 스트림으로 변경해주는 보조 스트림
		OutputStream os = System.out; // 모니터 출력(모니터가 도착지)
		OutputStreamWriter osw = new OutputStreamWriter(os); // OutputStreamWriter이 캐릭터 기반으로 쓰임

		Scanner scan = new Scanner(System.in);
		System.out.println("입력> ");
		String text = scan.nextLine();

		try {
			osw.write(text + "\n");
			osw.write("실행완료");
			osw.flush();
			osw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

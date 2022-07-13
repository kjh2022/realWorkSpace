package co.edu.io0713;

import java.awt.image.ImagingOpException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExample {
	public static void main(String[] args) {
		long start = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.png");
			FileOutputStream fos = new FileOutputStream("c:/Dev/image3.png");
			byte[] arr = new byte[10000]; //처리단위를 늘리는것
			
			while (true) {
				int buf = fis.read(arr);
				if (buf == -1) {break;}
				fos.write(arr);
			}
			fos.flush();
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("처리시간: " + (end - start) + " nanoTime.");
		
	}
	public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data2.dat");
			byte[] arr = new byte[2]; // 2바이트 크기만큼 읽어들이겠다는 뜻
			while (true) {
				int buf = fis.read(arr);
				if (buf == -1) {
					break;
				}
				for (int i = 0; i < buf; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

	public static void write2() {
		byte[] arr = { 10, 20, 30 };
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data2.dat");
			fos.write(arr);
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

// byte기반 입력스트림
	public static void write1() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data.dat");
			byte a = 10, b = 20, c = 30;
			fos.write(a);
			fos.write(b);
			fos.write(c);

			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ImagingOpException e) {
			e.printStackTrace();
		}
		System.out.println("실행 끝");
	}

	public static void read1() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data.dat");

			while (true) {
				int buf = fis.read();
				if (buf == -1) {
					break;
				}
				System.out.println(buf);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}
}

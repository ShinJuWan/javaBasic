package ch07;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {

	public static void main(String[] args) {
		InputStream in = System.in; // System.in(=키보드)
		
		// 1. 키보드는 A를 인코딩해서 01000001 으로 컴퓨터에게 전송
		// 2. ByteStream으로 흘러들어간다. (Input)
		// 3. read() 메서드로 01000001 -> 65로 디코딩한다. 
		// 4. 65 -> 문자로 부호화시킨다.
		try {
			int data = in.read();
			System.out.println(data); // System.out.println((char)data); - 부호화
		} catch (IOException e) { // IOException = 키보드로부터 데이터를 입력받는 와중에 발생할 수 있는 에러에 대한 예외처리
			e.printStackTrace();
		}
	}
}

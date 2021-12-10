package ch07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {

	public static void main(String[] args) {
		InputStream in = System.in; 
		// 단점 : 데이터를 가변적으로 받을 수 없다. 
		InputStreamReader ir = new InputStreamReader(in); // 65 -> A로 부호화

		try {
			char[] data = new char[1];
			ir.read(data);
			System.out.println(data);
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
}

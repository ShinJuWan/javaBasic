package ch07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {

	public static void main(String[] args) {
		InputStream in = System.in; 
		// ���� : �����͸� ���������� ���� �� ����. 
		InputStreamReader ir = new InputStreamReader(in); // 65 -> A�� ��ȣȭ

		try {
			char[] data = new char[1];
			ir.read(data);
			System.out.println(data);
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
}

package ch01;

// package = 자바(.java) 파일이 모여있는 폴더
public class VarEx01 {

	public static void main(String[] args) {
		boolean b1 = true; // 박스에 1이 저장됨
		boolean b2 = false; // 박스에 0이 저장됨
		
		int n1 = 1000; // 나 메모리에 4Byte 공간이 필요해
		double d1 = 1000.1; // 나 메모리에 8Byte 공간이 필요해
		char c1 = '가'; // 나 메모리에 2Byte 공간이 필요해
		
		System.out.println(c1); //모니터에 출력하겠다는 명령어
		System.out.println(n1);
		
		n1 = 50; // 값을 변경
		System.out.println(n1);
	}

}

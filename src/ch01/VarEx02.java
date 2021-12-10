package ch01;

// int n3 = 30; -> 자바의 모든 코드는 클래스 내에 존재해야 한다.

public class VarEx02 {
	
	static int n2 = 20;

	public static void main(String[] args) {
		int n1 = 10; // 해당 라인이 실행될 때 10이라는 숫자가 n1이라는 메모리 공간에 할당된다.
		System.out.println(n1); // main이라는 stack 공간의 n1
		System.out.println(n2); // VarEx02라는 static 공간의 n2
	}

}

package ch03;

public class OperEx04 {

	public static void main(String[] args) {
		System.out.println(1==1 && 1==2); // && = and // true와 false. and이기 때문에 결과는 false
		System.out.println(1==1 || 1==2); // || = or // true와 false. or이기 때문에 결과는 true
		
		int n1 = 1;
		int n2 = 2;
		System.out.println(n1==n1 || n1==n2);
		
		// 상수 = 변하지 않는 수(1)
		// 변수 = 변하는 수(n1)
	}
}

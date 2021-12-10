package ch03;

public class CastEx01 {

	public static void main(String[] args) {
		// 캐스팅 (다운캐스팅, 업캐스팅)
		int n1 = 100; // 4Byte
		double d1 = n1; // 8Byte (8Byte 공간에 4Byte를 입력했기 때문에 가능)
		System.out.println(d1); // 업캐스팅 / 작은걸(int) 큰쪽(double)으로 (묵시적으로 가능)
		
		double d2 = 100.8;
		// 명시적 형변환 (int) = 다운 캐스팅
		int n2 = (int)d2; // double을 int로 변환할 수 없어요.
		System.out.println(n2); // 100이 출력됨. 단점:데이터가 유실될 수 있다. 
		
		int money = 130;
		System.out.println(130/100); // 1
		System.out.println(money/100); // 1
		System.out.println(money/100.0); //1.3. int / double = double
	}
}

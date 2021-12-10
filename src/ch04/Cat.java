package ch04;

// 값을 초기화하지 않은 이유는 new 할때마다 다른 상태를 가진 고양이를 만들기 위해서이다.
public class Cat {
	String name;
	String color;

	// 디폴트 생성자. 
	// 개발자가 입력하지 않아도 존재함. (생략가능 코드)
	// 개발자가 직접 생성자를 구현하게 되면 디폴트 생성자가 생략될 수 없다. 
	public Cat() {
	
	}
	
	// 개발자가 직접 생성자 구현함
	public Cat(String n, String c) { // 생성자 (메서드)
		System.out.println("고양이 탄생함.");
		System.out.println("n:"+n);
		System.out.println("c:"+c);
		
		// String n, String c 는 지역변수 = Cat() 이라는 생성자(메서드)가 가진 지역변수
		name = n;
		color = c;
	}
}

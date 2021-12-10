package ch05;

class 프로토스유닛 {
	String name = "프로토스유닛";
	void 기본공격 (프로토스유닛 e1) {
		// System.out.println("프로토스유닛 메서드"); = 같은 메서드를 자식이 가지고 있기 때문에 무효화된다.
	}
	
	String 이름확인() {
		return "";
	}
}

class 질럿 extends 프로토스유닛 {
	String name = "질럿";
	
	// 오버라이드 = 부모의 메서드무효화하다. 
	void 기본공격 (프로토스유닛 e1) {
		System.out.println("질럿 메서드");
		System.out.println("질럿이 " + e1.이름확인() + "을 공격합니다.");
	}
	
	// 오버라이드 = 부모의 메서드를 무효화한다. 
	String 이름확인() {
		return name;
	}
}

class 드라군 extends 프로토스유닛 {
	String name = "드라군";
	
	// 오버라이드 = 부모의 메서드무효화하다. 
	void 기본공격 (프로토스유닛 e1) {
		System.out.println("드라군 메서드");
		System.out.println(this.name + "이 " + e1.이름확인() + "을 공격합니다.");
	}
	
	// 오버라이드 = 부모의 메서드를 무효화한다. 
	String 이름확인() {
		return name;
	}
}

class 다크템플러 extends 프로토스유닛 {
	String name = "다크템플러";
	
	// 오버라이드 = 부모의 메서드무효화하다. 
	void 기본공격 (프로토스유닛 e1) {
		System.out.println("다크템플러 메서드");
		System.out.println(this.name + "이 " + e1.이름확인() + "을 공격합니다.");
	}
	
	// 오버라이드 = 부모의 메서드를 무효화한다. 
	String 이름확인() {
		return name;
	}
}

// 오버라이드해서 class 생성
class 리버 extends 프로토스유닛 {
	String name = "리버";
	
	void 기본공격(프로토스유닛 e1) {
		System.out.println(this.name+"이"+e1.이름확인()+"을 공격합니다.");
	}
	
	String 이름확인() {
		return name;
	}
}

public class OOPEx06 {

	public static void main(String[] args) {
		프로토스유닛 u1 = new 질럿(); // heap 공간에 질럿, 프로토스 유닛
		프로토스유닛 u2 = new 드라군(); // heap 공간에 질럿, 프로토스 유닛
		프로토스유닛 u3 = new 다크템플러(); // heap 공간에 질럿, 프로토스 유닛
		프로토스유닛 u4 = new 리버();
		
		u1.기본공격(u2);
		u1.기본공격(u3);
		u2.기본공격(u3);
		u1.기본공격(u4);
	}
}

package ch02;

/*
 *  정리 : stack(지역변수 = 메서드가 실행될 때 메모리에 할당된다. 메서드가 종료될 때 메모리에서 사라진다.)
 *          heap(전역변수 = new할때 메모리에 할당된다. 더이상 참조하지 않을 때 메모리에서 사라진다.)
 *          static(전역변수 = main메서드가 실행되기 전에 메모리에 할당된다. main메서드가 종료되면 메모리에서 사라진다.)
 */

public class StackEx02 {

	static int sum = 20; // 전역변수 (static) main 메서드가 시작되기전에 sum이 할당된다.
	int value = 50; // 전역변수 (heap), 더이상 참조하지 않을 때 자동으로 사라진다.
	
	static void a() {
		// a 메서드가 실행될 때 stack공간에 n1이 할당되고 a메서드가 종료되면 메모리에서 사라진다. 
		int n1 = 1; // a의 메서드의 stack 영역에 저장됨 (지역변수)
		System.out.println(n1);
		
		// 아래 라인이 실행되려고 할 때 static 공간에 할당해야 하는데 불가능하다. static 공간 할당은 main 메서드 실행전에만 가능하다.
		// static int n2 = 2; 메서드 내에 static을 사용할 수는 없다. 
	}
	
	public static void main(String[] args) {
		a(); // 메서드를 호출한다.
		// System.out.println(n1);
		System.out.println(sum);
		// System.out.println(value); -> 메모리에 뜨지 않았기 때문에 에러 발생
		// 아래 라인에서 heap 공간에 value가 할당된다.
		StackEx02 s = new StackEx02(); // new 하게되면 static이 아닌 모든 것이 메모리에 뜬다.
		System.out.println(s.value);
		System.out.println("test1 - 더이상 s 변수를 참조하지 않기 때문에 메모리에서 사라진다.");
	}
}

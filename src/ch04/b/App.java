package ch04.b;

import ch04.a.Cal;

// main이 있는 자바파일을 실행파일이라고 한다. 
public class App {

	// JVM이 main 메서드를 찾으려면 public이 필요하다! (공개)
	// JVM이 main 메서드를 찾으려면 static이 필요하다! (메모리에 띄운다)
	// main 메서드만 return 타입을 허용하지 않는다. 
	public static void main(String[] args) {
		Cal c = new Cal();
		c.minus();
		// System.out.println(c.num);
	}
}

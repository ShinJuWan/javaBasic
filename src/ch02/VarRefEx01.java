package ch02;

// 현재는 정확한 크기를 컴퓨터는 알 수 없고, new가 되어서 힙에 할당이 될 때 사이즈를 알 수 있다. 
// 프로그램이 실행되었을 때 = Runtime
class MyData {
	int id = 1; // int 4Byte
	int price = 1000; // 4Byte
}

// 레퍼런스 변수(참조), 일반 변수
public class VarRefEx01 {
	
	public static void main(String[] args) {
		// 타입 + 변수; int num; => 변수 선언
		// 타입 + 변수 = 값; int num = 10; 변수를 초기화(메모리에 할당)한다.
		int num = 10; // 일반변수 (크기가 정해져 있는 것 = 컴파일 시점)
		MyData d = new MyData(); // 레퍼런스변수 (크기가 정해져 있지 않은 것 = 컴파일 시점)
	}
}

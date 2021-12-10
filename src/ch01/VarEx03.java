package ch01;

// MyVar은 클래스 자료형이다. = 개발자가 만드는 커스텀 자료형
// 여러가지 Type을 가지고 있는 클래스를 Beans라고 한다. 
class MyVar {
	static int n1 = 10;
	static char c1 = 'A';
}

class MyVar2 {
	static int n1 = 20;
	static char c1 = 'B';
}

public class VarEx03 {

	static int num = 500;
	
	public static void main(String[] args) {
		// System.out.println(n1); = 오류발생. n1을 찾을 수 없다. why? int n1이 메모리에 뜨지 않았기 때문에
		System.out.println(MyVar.n1);
		System.out.println(MyVar.c1);
		System.out.println(VarEx03.num);
		System.out.println(MyVar2.n1);
		System.out.println(MyVar2.c1);
	}

}

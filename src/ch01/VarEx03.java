package ch01;

// MyVar�� Ŭ���� �ڷ����̴�. = �����ڰ� ����� Ŀ���� �ڷ���
// �������� Type�� ������ �ִ� Ŭ������ Beans��� �Ѵ�. 
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
		// System.out.println(n1); = �����߻�. n1�� ã�� �� ����. why? int n1�� �޸𸮿� ���� �ʾұ� ������
		System.out.println(MyVar.n1);
		System.out.println(MyVar.c1);
		System.out.println(VarEx03.num);
		System.out.println(MyVar2.n1);
		System.out.println(MyVar2.c1);
	}

}

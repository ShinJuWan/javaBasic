package ch04.b;

import ch04.a.Cal;

// main�� �ִ� �ڹ������� ���������̶�� �Ѵ�. 
public class App {

	// JVM�� main �޼��带 ã������ public�� �ʿ��ϴ�! (����)
	// JVM�� main �޼��带 ã������ static�� �ʿ��ϴ�! (�޸𸮿� ����)
	// main �޼��常 return Ÿ���� ������� �ʴ´�. 
	public static void main(String[] args) {
		Cal c = new Cal();
		c.minus();
		// System.out.println(c.num);
	}
}

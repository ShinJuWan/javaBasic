package ch04;

// ���� �ʱ�ȭ���� ���� ������ new �Ҷ����� �ٸ� ���¸� ���� ����̸� ����� ���ؼ��̴�.
public class Cat {
	String name;
	String color;

	// ����Ʈ ������. 
	// �����ڰ� �Է����� �ʾƵ� ������. (�������� �ڵ�)
	// �����ڰ� ���� �����ڸ� �����ϰ� �Ǹ� ����Ʈ �����ڰ� ������ �� ����. 
	public Cat() {
	
	}
	
	// �����ڰ� ���� ������ ������
	public Cat(String n, String c) { // ������ (�޼���)
		System.out.println("����� ź����.");
		System.out.println("n:"+n);
		System.out.println("c:"+c);
		
		// String n, String c �� �������� = Cat() �̶�� ������(�޼���)�� ���� ��������
		name = n;
		color = c;
	}
}

package ch05;

import ch05.�Ӳ���;

class �Ӳ��� {
	
	void �޸���() {
		System.out.println("�޸���1");
	}
	
	// �����ε�
	void �޸���(int speed) {
		System.out.println("�޸���2");
	}
	
	void �޸���(double speed) {
		System.out.println("�޸���3");
	}
	
	void �޸���(int speed, double power) {
		System.out.println("�޸���4");
	}

	// �������� �ٸ��� �����ϸ� �Ǵµ� �� ���� �����ε��� ����ϴ°ɱ�?
	void �޸���2() {
		System.out.println("�޸���5");
	}
}

// �����ε� ������ ��!!
// �����ε��� �� ����ϴ°�?
public class OOPEx04 {

	public static void main(String[] args) {
		�Ӳ��� e = new �Ӳ���();
		e.�޸���();
		e.�޸���(1);
		e.�޸���(5.0);
		e.�޸���(1, 5.0);
		e.�޸���2(); 
	}
}

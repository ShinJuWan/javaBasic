package ch05;

// ���������� = ����Ʈ ����������, public ���� ������, private ����������
class Player {
	// ���� = �ʵ�
	String name; // �̸�
	private int thirty; // �񸶸� (0~100) // �ܺ� Ŭ�������� ���� �Ұ�
	
	public Player(String name, int thirty) {
		this.name = name;
		this.thirty = thirty;
	}
	
	// ���� = �޼���
	void �����ñ�() {
		System.out.println("�����ñ� ����");
		this.thirty = this.thirty - 50;
	}
	
	int �񸶸�����Ȯ��() {
		return this.thirty;
	}
}

public class OOPEx01 {

	public static void main(String[] args) {
		Player p1 = new Player("ȫ�浿", 100);
		System.out.println("�̸��� : " + p1.name);
		System.out.println("�������� : " + p1.�񸶸�����Ȯ��());
		
		// 1. ù��° �ó����� = ����(x)
		// p1.thirty = 50; // ���� = ���ξ��� �������� ����
		// System.out.println("�������� : " + p1.thirty);
		
		// 2. �ι�° �ó����� = ���°� ������ ������ (x) - �Ǽ��� �� ����.
		// p1.�����ñ�();
		// p1.thirty = 50;
		// System.out.println("�������� : " + p1.thirty);
		
		// 3. ����° �ó�����
		p1.�����ñ�();
		System.out.println("�������� : " + p1.�񸶸�����Ȯ��());
	}
}
package ch05;

class �����佺���� {
	String name = "�����佺����";
	void �⺻���� (�����佺���� e1) {
		// System.out.println("�����佺���� �޼���"); = ���� �޼��带 �ڽ��� ������ �ֱ� ������ ��ȿȭ�ȴ�.
	}
	
	String �̸�Ȯ��() {
		return "";
	}
}

class ���� extends �����佺���� {
	String name = "����";
	
	// �������̵� = �θ��� �޼��幫ȿȭ�ϴ�. 
	void �⺻���� (�����佺���� e1) {
		System.out.println("���� �޼���");
		System.out.println("������ " + e1.�̸�Ȯ��() + "�� �����մϴ�.");
	}
	
	// �������̵� = �θ��� �޼��带 ��ȿȭ�Ѵ�. 
	String �̸�Ȯ��() {
		return name;
	}
}

class ��� extends �����佺���� {
	String name = "���";
	
	// �������̵� = �θ��� �޼��幫ȿȭ�ϴ�. 
	void �⺻���� (�����佺���� e1) {
		System.out.println("��� �޼���");
		System.out.println(this.name + "�� " + e1.�̸�Ȯ��() + "�� �����մϴ�.");
	}
	
	// �������̵� = �θ��� �޼��带 ��ȿȭ�Ѵ�. 
	String �̸�Ȯ��() {
		return name;
	}
}

class ��ũ���÷� extends �����佺���� {
	String name = "��ũ���÷�";
	
	// �������̵� = �θ��� �޼��幫ȿȭ�ϴ�. 
	void �⺻���� (�����佺���� e1) {
		System.out.println("��ũ���÷� �޼���");
		System.out.println(this.name + "�� " + e1.�̸�Ȯ��() + "�� �����մϴ�.");
	}
	
	// �������̵� = �θ��� �޼��带 ��ȿȭ�Ѵ�. 
	String �̸�Ȯ��() {
		return name;
	}
}

// �������̵��ؼ� class ����
class ���� extends �����佺���� {
	String name = "����";
	
	void �⺻����(�����佺���� e1) {
		System.out.println(this.name+"��"+e1.�̸�Ȯ��()+"�� �����մϴ�.");
	}
	
	String �̸�Ȯ��() {
		return name;
	}
}

public class OOPEx06 {

	public static void main(String[] args) {
		�����佺���� u1 = new ����(); // heap ������ ����, �����佺 ����
		�����佺���� u2 = new ���(); // heap ������ ����, �����佺 ����
		�����佺���� u3 = new ��ũ���÷�(); // heap ������ ����, �����佺 ����
		�����佺���� u4 = new ����();
		
		u1.�⺻����(u2);
		u1.�⺻����(u3);
		u2.�⺻����(u3);
		u1.�⺻����(u4);
	}
}

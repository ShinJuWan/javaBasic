package ch05;

interface MoveAble {
	// public abstract �����Ǿ�����
	void ��();
	void �Ʒ�();
	void ����();
	void ������();
}

interface MoveAble2 {
	// public abstract �����Ǿ�����
	void ��();
	void �Ʒ�();
	void ����();
	void ������();
	void ���ٴڼ���();
}


abstract class  �糪�µ��� implements MoveAble{
	abstract void ����(); // �̿ϼ� �޼���
	@Override
	public void ��() {
		System.out.println("�������� �̵�");
	}
	@Override
	public void �Ʒ�() {
		System.out.println("�Ʒ������� �̵�");
	}@Override
	public void ����() {
		System.out.println("�������� �̵�");		
	}@Override
	public void ������() {
		System.out.println("���������� �̵�");		
	}
}

abstract class �¼��ѵ��� implements MoveAble2 {
	abstract void ä��(); // �̿ϼ� �޼���

	@Override
	public void ��() {
		System.out.println("�������� �̵�");		
	}

	@Override
	public void �Ʒ�() {
		System.out.println("�Ʒ������� �̵�");				
	}

	@Override
	public void ����() {
		System.out.println("�������� �̵�");				
	}

	@Override
	public void ������() {
		System.out.println("���������� �̵�");				
	}

	@Override
	public void ���ٴڼ���() {
		System.out.println("���ٴ����� �̵�");				
	}
	
	
}

// interface ������ �ڽ� Ŭ������ ���ӵ�
class ������ extends �¼��ѵ��� {

	@Override // ������̼� = JVN�� ����ÿ� �м��ؼ� Ȯ���Ͽ� �����Ѵ�. 
	void ä��() {
		System.out.println("�ٳ��� ä��");
	}
	
}

class �� extends �¼��ѵ��� {

	@Override
	void ä��() {
		System.out.println("Ǯ ä��");
	}
	
}

class ȣ���� extends �糪�µ��� {

	@Override
	void ����() {
		System.out.println("�̻��� ����");
	}
	
}

class �ڻԼ� extends �糪�µ��� {

	@Override
	void ����() {
		System.out.println("�����ġ��� ����" );
	}
	
}

public class OOPEx09 {
	
	static void ���̽�ƽ(�¼��ѵ��� u1) {
		u1.ä��();
		u1.���ٴڼ���();
		u1.��();
		u1.�Ʒ�();
		u1.������();
		u1.����();
		System.out.println("=====================");
		
	}
	
	static void ���̽�ƽ(�糪�µ��� u1) {
		u1.����();
		u1.��();
		u1.�Ʒ�();
		u1.������();
		u1.����();
		System.out.println("=====================");
	}

	public static void main(String[] args) {
		�� u1 = new ��();
		���̽�ƽ(u1);
		������ u2 = new ������();
		���̽�ƽ(u2);
		
		ȣ���� u3 = new ȣ����();
		���̽�ƽ(u3);
		�ڻԼ� u4 = new �ڻԼ�();
		���̽�ƽ(u4);
	}
}

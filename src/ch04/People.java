package ch04;

public class People {
	String name;
	int age;
	 
	// ����Ʈ �����ڰ� �������? yes. ���� �����ڸ� �����ڰ� ������ �ʾұ� ������ ������. 
	// .java -> .class ������ �ÿ� �ڹٰ� �ڵ����� �ڵ带 �������
	// �����ڰ� ���� �����ڸ� �����Ͽ��� ������ ����Ʈ �����ڴ� �ڵ��������� ����.
	public People(String name, int age) {
		System.out.println("People �޼��� ���� name :" + name);
		System.out.println("People �޼��� ���� age : " + age);
		this.name = name;
		this.age = age;
	}
}

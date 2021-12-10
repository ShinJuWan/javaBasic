package ch05;

// �߻� Ŭ���� (�߻�޼��� �Ӹ� �ƴ϶� �Ϲݸ޼��嵵 ���� �� �ִ�.)
abstract class Animal {
	abstract void speak(); // �߻�޼��� (��ü({})�� ����.) 
}

class Dog extends Animal {
	// �������̵� (Animal�� speak()�� ��ȿȭ�ȴ�.)
	void speak() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	// �������̵� (Animal�� speak()�� ��ȿȭ�ȴ�.)
	void speak() {
		System.out.println("�߿�");
	}
}

class Bird extends Animal {

	// �߻�޼��带 �θ� ������ ������ �ڽ��� �߻�޼��带 �ݵ�� �����ؾ� �ϴ� �������� �����.
	@Override
	void speak() {
		System.out.println("±±");
	}
	
}

public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Bird();
		a1.speak(); // �������ε� �ȴ�. ��? �θ��� �޼��尡 ��ȿȭ�Ǵϱ�!!
		a2.speak();
		a3.speak();
		
	}
}
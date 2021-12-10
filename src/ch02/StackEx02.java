package ch02;

/*
 *  ���� : stack(�������� = �޼��尡 ����� �� �޸𸮿� �Ҵ�ȴ�. �޼��尡 ����� �� �޸𸮿��� �������.)
 *          heap(�������� = new�Ҷ� �޸𸮿� �Ҵ�ȴ�. ���̻� �������� ���� �� �޸𸮿��� �������.)
 *          static(�������� = main�޼��尡 ����Ǳ� ���� �޸𸮿� �Ҵ�ȴ�. main�޼��尡 ����Ǹ� �޸𸮿��� �������.)
 */

public class StackEx02 {

	static int sum = 20; // �������� (static) main �޼��尡 ���۵Ǳ����� sum�� �Ҵ�ȴ�.
	int value = 50; // �������� (heap), ���̻� �������� ���� �� �ڵ����� �������.
	
	static void a() {
		// a �޼��尡 ����� �� stack������ n1�� �Ҵ�ǰ� a�޼��尡 ����Ǹ� �޸𸮿��� �������. 
		int n1 = 1; // a�� �޼����� stack ������ ����� (��������)
		System.out.println(n1);
		
		// �Ʒ� ������ ����Ƿ��� �� �� static ������ �Ҵ��ؾ� �ϴµ� �Ұ����ϴ�. static ���� �Ҵ��� main �޼��� ���������� �����ϴ�.
		// static int n2 = 2; �޼��� ���� static�� ����� ���� ����. 
	}
	
	public static void main(String[] args) {
		a(); // �޼��带 ȣ���Ѵ�.
		// System.out.println(n1);
		System.out.println(sum);
		// System.out.println(value); -> �޸𸮿� ���� �ʾұ� ������ ���� �߻�
		// �Ʒ� ���ο��� heap ������ value�� �Ҵ�ȴ�.
		StackEx02 s = new StackEx02(); // new �ϰԵǸ� static�� �ƴ� ��� ���� �޸𸮿� ���.
		System.out.println(s.value);
		System.out.println("test1 - ���̻� s ������ �������� �ʱ� ������ �޸𸮿��� �������.");
	}
}

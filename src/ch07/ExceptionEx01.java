package ch07;

class �� {
	void shoot() {
		System.out.println("���� �߻��߽��ϴ�.");
	}
}

public class ExceptionEx01 {

	public static void main(String[] args) {
		// ������ ����. Exception�� ���� �θ�. 
		try {
			System.out.println("���ڱ� ����");
			Thread.sleep(1000); // ���� �����尡 1�� ���� ���� �ܴ�!!
			System.out.println("���ڱ� ��");
		} catch (InterruptedException e) { // ����!!(=Interrupted) 
			e.printStackTrace();
		}
		
		// ��Ÿ�� ����. RuntimeException�� ���� �θ�.
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[3]); // �迭�� 3������ ���� ������ ���� �߻�
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch�� ������ try(�õ�)�ϴٰ� ���ܰ� �߻��ϸ� ��� ó�������� �����ϴ� ����
			System.out.println("������. �׳� ������.");
			System.out.println(e.getMessage()); // ������ Ȯ���� �� �ִ�. �����ͺ��̽� Ȥ�� �α׿� ���� �����Ѵ�.
			e.printStackTrace(); // ���� ���� �ΰ�
		}
		
		�� s = null;
		try {
			s.shoot();
		} catch (NullPointerException e) {
			System.out.println("���� ��� ���� ����� �ٽ� �õ��ϰڽ��ϴ�.");
			s = new ��();
			s.shoot();
		}
		
		System.out.println("���� ������ ����"); // ���� �ڵ忡 ������ ������ �ش� �ڵ�� ������� �ʴ´�. 
	}
}

package ch07;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("�ٴ�");
		String s2 = new String("�ٴ�");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); // java���� ==�� �ּҸ� ���Ѵ�. 
		
		String s3 = "�ٴ�";
		String s4 = "�ٴ�";
		System.out.println(s3==s4);
		
		s3 = s3 + "�¾�";
		System.out.println(s3); // ���� �������� "�¾�"�� �߰��Ǵ� ���� �ƴ϶� ���ο� ������ �Ҵ��. 
		System.out.println(s4);
		System.out.println(s3==s4);
		s3 = s3 + "��";
		System.out.println(s3); // ���� �������� "�¾�"�� �߰��Ǵ� ���� �ƴ϶� ���ο� ������ �Ҵ��.
		System.out.println(s3==s4);
		
		// ���ڿ��� ���� ���� equals�� ����Ѵ�. 
		System.out.println(s1.equals("�ٴ�"));
	}
}

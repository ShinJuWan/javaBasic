package ch03;

public class CastEx01 {

	public static void main(String[] args) {
		// ĳ���� (�ٿ�ĳ����, ��ĳ����)
		int n1 = 100; // 4Byte
		double d1 = n1; // 8Byte (8Byte ������ 4Byte�� �Է��߱� ������ ����)
		System.out.println(d1); // ��ĳ���� / ������(int) ū��(double)���� (���������� ����)
		
		double d2 = 100.8;
		// ������ ����ȯ (int) = �ٿ� ĳ����
		int n2 = (int)d2; // double�� int�� ��ȯ�� �� �����.
		System.out.println(n2); // 100�� ��µ�. ����:�����Ͱ� ���ǵ� �� �ִ�. 
		
		int money = 130;
		System.out.println(130/100); // 1
		System.out.println(money/100); // 1
		System.out.println(money/100.0); //1.3. int / double = double
	}
}
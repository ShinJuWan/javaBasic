package ch06;

public class ArrayForEx01 {
	
	static void �����ݾװ��(int coin[], int restMoney) {
		// ch03 package�� ConinExample.java�� �迭�� for���� �̿��ؼ� �����ϼ���. - �����丵
		for(int i=0; i<4; i++) {
			System.out.println(coin[i]+"�� : " + (restMoney / coin[i])); // 180�� ����
			restMoney = restMoney % coin[i];
			System.out.println("�����ݾ� : " + restMoney);
			System.out.println("===============================");
		}
	}

	public static void main(String[] args) {

		// �������ϱ� 500, 100, 50, 10
		int coin[] = {500, 100, 50, 10};
		int money = 1350;
		int restMoney = money; // restMoney = Ŀ��ǥ���
		
		// ch03 package�� ConinExample.java�� �迭�� for���� �̿��ؼ� �����ϼ���. - �����丵
		�����ݾװ��(coin, restMoney);
	}
}

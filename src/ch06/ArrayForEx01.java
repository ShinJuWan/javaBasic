package ch06;

public class ArrayForEx01 {
	
	static void 남은금액계산(int coin[], int restMoney) {
		// ch03 package의 ConinExample.java를 배열과 for문을 이용해서 수정하세요. - 리펙토링
		for(int i=0; i<4; i++) {
			System.out.println(coin[i]+"원 : " + (restMoney / coin[i])); // 180원 남음
			restMoney = restMoney % coin[i];
			System.out.println("남은금액 : " + restMoney);
			System.out.println("===============================");
		}
	}

	public static void main(String[] args) {

		// 동전구하기 500, 100, 50, 10
		int coin[] = {500, 100, 50, 10};
		int money = 1350;
		int restMoney = money; // restMoney = 커멜표기법
		
		// ch03 package의 ConinExample.java를 배열과 for문을 이용해서 수정하세요. - 리펙토링
		남은금액계산(coin, restMoney);
	}
}

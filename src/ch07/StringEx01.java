package ch07;

public class StringEx01 {

	public static void main(String[] args) {
		String s1 = new String("바다");
		String s2 = new String("바다");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); // java에서 ==은 주소를 비교한다. 
		
		String s3 = "바다";
		String s4 = "바다";
		System.out.println(s3==s4);
		
		s3 = s3 + "태양";
		System.out.println(s3); // 기존 영역에서 "태양"이 추가되는 것이 아니라 새로운 영역이 할당됨. 
		System.out.println(s4);
		System.out.println(s3==s4);
		s3 = s3 + "달";
		System.out.println(s3); // 기존 영역에서 "태양"이 추가되는 것이 아니라 새로운 영역이 할당됨.
		System.out.println(s3==s4);
		
		// 문자열을 비교할 때는 equals를 사용한다. 
		System.out.println(s1.equals("바다"));
	}
}

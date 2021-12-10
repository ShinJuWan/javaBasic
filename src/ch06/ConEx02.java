package ch06;

public class ConEx02 {

	public static void main(String[] args) {
		int point = 80;
		
		// 성적이 90점이 넘으면 통과
		// 90점이 안되면 재수강
		if(point > 90) {
			System.out.println("통과");
		} else {
			System.out.println("재수강");
		}
	}
}

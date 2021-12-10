package ch06;

public class ConEx03 {

	public static void main(String[] args) {
		int point = 70;
		
		// 90점이 넘으면 A
		// 80점이 넘으면 B
		// 80점이 안되면 재수강
		if(point > 90) {
			System.out.println("A");
		} else if(point > 80) {
			System.out.println("B");
		} else {
			System.out.println("재수강");
		}
	}
}

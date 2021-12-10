package ch07;

class 총 {
	void shoot() {
		System.out.println("총을 발사했습니다.");
	}
}

public class ExceptionEx01 {

	public static void main(String[] args) {
		// 컴파일 예외. Exception이 최종 부모. 
		try {
			System.out.println("잠자기 시작");
			Thread.sleep(1000); // 메인 스레드가 1초 동안 잠은 잔다!!
			System.out.println("잠자기 끝");
		} catch (InterruptedException e) { // 방해!!(=Interrupted) 
			e.printStackTrace();
		}
		
		// 런타임 예외. RuntimeException이 최종 부모.
		int[] nums = {1,2,3};
		try {
			System.out.println(nums[3]); // 배열에 3번지가 없기 때문에 오류 발생
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch의 역할은 try(시도)하다가 예외가 발생하면 어떻게 처리할지를 정의하는 영역
			System.out.println("괜찮아. 그냥 진행해.");
			System.out.println(e.getMessage()); // 오류를 확인할 수 있다. 데이터베이스 혹은 로그에 남겨 나야한다.
			e.printStackTrace(); // 오류 추적 로고
		}
		
		총 s = null;
		try {
			s.shoot();
		} catch (NullPointerException e) {
			System.out.println("총이 없어서 총을 만들고 다시 시도하겠습니다.");
			s = new 총();
			s.shoot();
		}
		
		System.out.println("메인 스레드 종료"); // 위의 코드에 오류가 있으면 해당 코드는 실행되지 않는다. 
	}
}

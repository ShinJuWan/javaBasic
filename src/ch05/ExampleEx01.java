package ch05;

interface RemoconAble {
	public void �ʷϹ�ư();
	public void ������ư();
}

class Samsung implements RemoconAble {

	@Override
	public void �ʷϹ�ư() {
		System.out.println("������ �������ϴ�.");
	}

	@Override
	public void ������ư() {
		System.out.println("������ �������ϴ�.");
	}
	
}

class LG implements RemoconAble {

	@Override
	public void �ʷϹ�ư() {
		System.out.println("������ �������ϴ�.");
	}

	@Override
	public void ������ư() {
		System.out.println("������ �������ϴ�.");
	}
	
}

public class ExampleEx01 {

	public static void main(String[] args) {
		
		Samsung s1 = new Samsung();
		Samsung s2 = new Samsung();
		
		LG g1 = new LG();
		LG g2 = new LG();
	}
}

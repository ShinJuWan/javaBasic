package ch06;

class 掙熱 {
	String name = "掙熱";
}

class 瞪餌 {
	String name = "瞪餌";
}

public class ObjectEx02 {

	public static void main(String[] args) {
		掙熱[] s1 = new 掙熱 [2];
		s1[0] = new 掙熱();
		s1[1] = new 掙熱();
		
		System.out.println(s1[0].name);
		System.out.println(s1[1].name);
		
		Object[] o1 = new Object [2];
		o1[0] = new 掙熱();
		o1[1] = new 瞪餌();
		
		// 欽薄 - 棻遴議蝶た!!
		掙熱 g1 = (掙熱)o1[0];
		瞪餌 g2 = (瞪餌)o1[1];
		
		System.out.println(g1.name);
		System.out.println(g2.name);
	}
}

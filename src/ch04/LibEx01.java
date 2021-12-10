package ch04;

import java.util.Random;

import recipe.MySoup;

// JDK 설치 - JDK(java, javac 등), JRE(라이브러리), JVM(자바 가상머신)
public class LibEx01 {

	public static void main(String[] args) {
		MySoup m = new MySoup();
		// jar 파일은 .class 파일로 들어오게 된다.
		m.김치찌개();
		
		Random r = new Random();
		System.out.println(r.nextInt());
	}
}

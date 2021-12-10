package ch04;

public class People {
	String name;
	int age;
	 
	// 디폴트 생성자가 있을까요? yes. 따로 생성자를 개발자가 만들지 않았기 때문에 존재함. 
	// .java -> .class 컴파일 시에 자바가 자동으로 코드를 만들어줌
	// 개발자가 직접 생성자를 정의하였기 때문에 디폴트 생성자는 자동생성되지 않음.
	public People(String name, int age) {
		System.out.println("People 메서드 스택 name :" + name);
		System.out.println("People 메서드 스택 age : " + age);
		this.name = name;
		this.age = age;
	}
}

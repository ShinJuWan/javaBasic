package ch01;

// VarEx05 -> main

// Note -> x

class Note {
	int price = 2000;
}

public class VarEx05 {

	public static void main(String[] args) {
		Note note1 = new Note(); // heap 공간에 Note 클래스가 가지고 있는 모든 데이터를 할당 (static 제외) 
		Note note2 =new Note();
		Note note3 =new Note(); // heap 공간
		int age = 25; // main stack 공간
		System.out.println(age);
		System.out.println(note1.price);
		System.out.println(note2.price);
		System.out.println(note3.price);
	}

}

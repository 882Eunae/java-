package com.yedam.collections;

//제네릭 
class Box<E> {
	E item;
	void setItem(E item) {
		this.item = item;
	}
	E getItem() {
		return item;
	}
}// end of Box

public class BoxExe {
	public static void main(String[] args) {
		Box<String> box = new Box();
		box.setItem("오렌지");

		String result = (String) box.getItem(); // object ->String 캐스팅작업
		System.out.println();

	}
}

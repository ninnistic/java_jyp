package day12;

public class Ex2_Inheritance2 {

	public static void main(String[] args) {
	     C c = new C ();
	     c.print();

	}

}

class A {
	public void print() {
		System.out.println("Hello");
	}
}

class B {
	public void print() {
		System.out.println("Hi");
	}
}

//클래스 c는 클래스 a와 b를 동시에 상속받을 수 없다.
// 동시상속이 가능하다면 클래스 c를 이용하여 생성한 객체에 print()를 호출했을 때 a의 print인지 b의 print인지 알 수 없다.
// 그래서 동시 상속이 안된다.
//class C extends A, B {

class C extends A {}
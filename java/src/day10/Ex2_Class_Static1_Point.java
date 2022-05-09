package day10;

public class Ex2_Class_Static1_Point {

	public static void main(String[] args) {
		//에러발생 : print() 메소드는 객체 메소드이기 때문에 클래스 이름으로 호출할 수 없다.
		//Point1.print();
		Point1 p1 = new Point1(10,20);
		p1.print();
		// 따라서 객체 생성 후에 이렇게 호출해야 한다.
		//printDimensional() 메소드는 클래스 메소드이기 때문에 클래스 이름으로 호출할 수 있다.
		Point1.printDimensional();
		//클래스 메소드는 객체를 이용하여 호출할 수 있지만 경고가 뜬다.
		p1.printDimensional();
		
	}

}

class Point1 {
	static String dimensional = "이차원"; //공용으로 쓰는 변수기때문에 static을 붙여줌. 따라서 클래스변
	int x, y ; // 객체변수
	
	public Point1(int x, int y) {
		// 내 필드 x,y에 매개변수 x,y의 값을 저장 
		this.x = x;
		this.y = y;
	}
	public Point1() {
		this (0,0);
	
	}
	// 객체변수가 들어있기 때문에 static을 붙이면 에러가 난다.
	public void print() { 
		System.out.println("차원 :  " + dimensional);
		System.out.println("좌표 :  " + x + "," + y);
	}
	// 이것도 객체변수가 들어있기 때문에 static을 붙이면 에러가 난다.
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//객체변수가 없고, 클래스변수만 쓰이기 때문에 static 선언 가능. 
	public static void printDimensional() {
		System.out.println("차원 : " + dimensional);
	}
}

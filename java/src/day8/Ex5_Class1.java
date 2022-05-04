package day8;

public class Ex5_Class1 {

	public static void main(String[] args) {
		Point1 p1 = new Point1();
		p1.print();
		p1.x1 = 20;
		// p1.x2 = 20; private으로 지정된 x2는 에러발생한다. private은 다른 클래스로 넘어갈 수 없음..
		p1.x = 20;
		p1.print();

	}

}

/* class 앞에 public은 아무때나 올 수 없다. 오직 class이름과 pile이름이 같은 경우에만 붙일 수 있다.*/
/* 좌표 평면(2차원 화면)에서 두 점을 나타내는 클래스 : Point*/
class Point1{
	// 멤버변수 => 좌표평면에서 점을 나타내기 위해 필요한 정보 => 클래스 내의 메소드에서 호출 가능.
	// 멤버변수는 초기화를 하지 않아도 각 타입의 기본값으로 초기화가 자동으로 된다.
	// x좌표  y좌표, 
	int x, y;
	public int x1, y1;
	private int x2, y2;

	// 메소드 => 기능 
	// 현재 좌표를 출력하는 기능
	/* 매개변수 : 정수 x의값, y의 값 => int 가 아니라 없음 
	 * 리턴타입 : 정수 x 와 y의 값 => 정수 int 이 아니라 콘솔에 출력할거라 void
	 * 메소드명 : print
	 */
	public void print() {
		System.out.println(x + "," + y);
		x1 = 20;
		x2 = 20;
	}
}

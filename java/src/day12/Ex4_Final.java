package day12;

public class Ex4_Final {

	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		ft.print();

	}

}
//String은 final class 이기 떄문에 상속이 불가능합니다.
//class KoreanString extends String{}


class FinalTest{
	private final int max = 30;
	public final void print() {
		//max = 20;  //max에 final이 붙어있기 때문에 수정할 수 없다. 
		System.out.println(max);
	}
}

class FinalTestChild extends FinalTest{
	//print()를 오버라이드 할 수 없다 => print()에 final이 붙어있기 때문이다.
	//public final void print() {
		
	}

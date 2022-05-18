package day01;

public class Ex3_Variable2 {

	public static void main(String[] args) {
		/* 변수는 읽기를 하려면 초기화가 되어있어야 한다.
		 * 초기화가 되어있지 않은 변수를 읽으려고 하면 에러가 발생한다
		 */
		int num;
		num = 10;
		System.out.println(num);// 변수가 초기화가 되지 않아 에러 발생
		
		System.out.println(num); // 중간에 초기화를 해서 에러 발생하지 않음 
		
		
	}

}

package day8;

public class Ex1_Method1 {

	public static void main(String[] args) {
		/*두 정수의 합을 알려주는 메소드를 작성해보세요.*/
		int num1 = 1, num2 = 2;
		int res = sum1(num1, num2);
		System.out.println(res);
		System.out.println(sum1(1,2));
		sum2(1,2);
		// 1 + 2 + 3
		int res1 = sum1(1,2);
		int res2 = sum1(res1,3);
		System.out.println(res2);


	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메소드 
	 * 매개변수 : 두 정수 => int num1, int num2 (매개변수는 변수명 앞에 각 타입을 각각가가가각 지정해줘야 한다.)
	 * 로컬변수는 자료의 타입이 같으면 ,로 쓰지만, 매개변수는 각각 지정해준다. int num1, int num2 이런식으로 타입을 일일이 다 써줘야한다.
	 * 리턴타입 : 두 정수의 합; => 정수 => int
	 * 메소드 명 : sum
	 * 
	 * */
	public static int sum1(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 콘솔에 출력하는 메소드. 
	 * 매개변수 : 두 정수 => int num1, int num2 
	 * 리턴타입 : 없음 = void
	 * 메소드 명 : sum2
	 * 
	 * */
	public static void sum2(int num1, int num2) {
		int res = num1 + num2;
		System.out.println(res);
	}
}
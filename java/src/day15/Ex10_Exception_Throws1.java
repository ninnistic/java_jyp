package day15;

public class Ex10_Exception_Throws1 {

	public static void main(String[] args) {
	
		try {
			int num = 10;
			System.out.println("프로그램 시작");
			if(num % 2 == 0) {
			throw new ArithmeticException("예외"); // 프로그램 시작한 이후에 예외를 발생시키는 객체를 생성해서, 바로 catch로 넘어갔다. 그래서 밑에 코드가 실행이 안된다.
																										//unrecahable 에러 발생
			}										//그래서 조건을 짝수이면 실행한다는 조건을 생성하자 에러가 사라졌다.
			System.out.println("프로그램 동작");
		} catch(ArithmeticException e) {
			System.out.println("산술 예외 발생");
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
		System.out.println("프로그램 종료");
	}

}

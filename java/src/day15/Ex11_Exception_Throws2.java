package day15;

public class Ex11_Exception_Throws2 {

	public static void main(String[] args) {
	 try {
		 throwException2();
		
	 }catch(RuntimeException e) {
		 System.out.println("런타임 예외");
	 }catch(Exception e) {
		 System.out.println("예외");
	 }
		
	}
	public static void throwException() throws Exception { // 무조건 예외를 발생시키는 코드
		/* Exception class는 RuntimeException class의 Base(부모) Class이기 때문에
		 * RuntimeException class가 아니다. 
		 * 그래서 Exception은 RuntimeException이 아니기 때문에, throws를 적어줘야 한다. 
		 */
		throw new Exception();
	}
	public static void throwException2()  {
		/*RumtimeException 이기 때문에, throws를 적어도 되고 안적어도 된다. */
		throw new RuntimeException();
	}
}

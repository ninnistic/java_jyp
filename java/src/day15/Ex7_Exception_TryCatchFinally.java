package day15;

public class Ex7_Exception_TryCatchFinally {

	public static void main(String[] args) {
		int num1 = 1, num2 = 0;
		int res = 0;
		try {
			// 예외처리를 안하고 예외가 발생하면, 프로그램이 중단되지만.
			// 예외처리를 한 상태에서 예외가 발생하면 프로그램은 중단되지 않고 예외처리를 한 후, 이어서 실행을 한다. 
			// 예외가 발생하면 밑에 코드가 있던 없던, 상관없이 예외를 처리할 수 있는 catch로 이동해서 예외처리를 한다.
			// (예외 처리를 할 수 있는 catch가 없으면, 처리할수 없어서 프로그램 중단됨)
			// catch는 여러개가 올 수 있고(1개 이상), Exception은 무조건 마지막 catch에 배치해야 한다. 
			// catch를 작성할 때 부모 예외들을 자식  아래로 배치해야 한다.
			// 가장 큰 범위의 catch를 수행할 수 있는 부모 예외처리용이 가장 밑으로가야한다.. 
			res = num1 % num2;
			System.out.println(res);
	  	//-> {} RuntimeException을 ArrayIndexblah~ 위에 추가하면 에러가 발생한다.
			// ArrayIndexOutof~ 가 발생해도, RuntimeException에서 걸리기 때문에
			//ArrayIndex~ 까지 올일이 없기 때문이다.
			//} catch (RuntimeException e) -
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("예외 발생");
			return;
		} finally {
			/* finally 는 예외 처리후에 메소드가 종료되어도, 무조건 finally는 실행이 된다.*/
			System.out.println("finally입니다.");
		}
		// catch(ArithmeticException e) 가 오면 에러가발생한다.
		// Exception e때문에 절대 여기까지 올 수 없음. 
		System.out.println("프로그램 종료 ");
	}

}

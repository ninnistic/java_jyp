package day21;

public class Ex02_Lambda2 {

	public static void main(String[] args) {
		Test1 t1 = 
			(int a) -> System.out.println("테스트 : " +a);
			
			t1.test(10);
		/*	
		Test2 t2 = (int a, int b)-> {
			return a+b;
		};
		*/
			
		Test2 t2 = (int a, int b) -> a+b;
		
		System.out.println(t2.sum(10,20));
		}
	}

interface Test1{
	void test(int a);
}
interface Test2{
	int sum(int a, int b);
}
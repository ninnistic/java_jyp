package day02;

public class Ex10_Test1 {

	public static void main(String[] args) {
		/* Q1.num이 짝수인지 아닌지 확인하는 코드를 작성하세요.
		 * A성적 출력하는 예제를 활용
		 * num % 2 == 0 
		 * 참 또는 거짓 
		 */
		
		//내 코드
		int num = 4;
		String is짝수 = (num % 2 == 0) ? "짝수입니다. " : "홀수입니다. ";		
		System.out.println(num + "는 " + is짝수);
		
		//선생님 코드
		int num1 = 1;
		System.out.println(num1 + "는 짝수인가? " + (num % 2 == 0)); // true 혹은 false를 가져야 하기 때문에. 알아서 출력됨
	
		//Q2. num이 짝수면 num은 짝수라고 출력하고,
		//num이 짝수가 아니면 num은 짝수가 아님이라고 출력하도록 코드를 만들어보세요.
		
		int num2 = 4;
		String isA = (num2 % 2 == 0) ? "짝수입니다. " : "홀수입니다. ";		
		System.out.println(num2 + "는 " + isA); // 이거 그대로 쓰면 될듯?
	
		//선생님 풀이
		String str = (num % 2 == 0)? "짝수" : "홀수"; 
		System.out.println(num + "는 " + str);
	}

}

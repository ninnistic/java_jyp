package day02;

public class Ex11_if1 {

	public static void main(String[] args) {
		/* num이 짝수이면 짝수라고 출력하는 코드를 if문을 이용하여 작성하세요.
		 * ~하면 ...한다
		 * ~ : 조건식
		 * ... : 실행문;
		 * if(조건식) {
		 			실행문;	
		 	}
		 */
		int num = 2;
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수입니다");
			
		}
	/* score이 90점 이상이고, 100점 이하이면 A학점이라고 출력하는 코드를 if문을 이용하여 작성하세요.*/
	 
	 int score = 95;
	 if(score >= 90 && score <= 100 ) { 		// =<로 안쓰도록 유의하셈..
		 System.out.println(score + "는 A입니다."); 
		 }
	 
	}
}

package day02;

public class Ex13_if3 {

	public static void main(String[] args) {
		/*num가 양수면 양수라고 출력하고,
		 * num가 음수이면 음수라고 출력하고,
		 * num가 0이면 0이라고 출력하는 코드를 if문을 이용하여 작성하세요.
		
		 */ 
		 /* if문에서 
		  * if는 반드시 1개 있어야함.
		  * else if는 0개 이상, (없을 수도 있고 있다면 여러개 있을 수도 있다.)
		  * else는 0개 or 1개다.  
		 */
		int num = 5;
		if (num > 0) {
		System.out.println("양수입니다.");
		}
		else if (num < 0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0입니다."); // 음수 아니면 양수, 아니면 0 이기 때문에 else if랑 else 둘다 쓸 수 있음. 양수이면서 0이거나 음수이면서 0인 수가 없다.
		}
	}
}

	/*int num = 5;
if (num > 0); {											 // 여기에서 ;를 넣어서 33행에서 에러가 발생했다.
System.out.println("양수입니다.");
}
else if (num < 0) {
	System.out.println("음수입니다.");
}
else {
	System.out.println("0입니다."); // 음수 아니면 양수, 아니면 0 이기 때문에 else if랑 else 둘다 쓸 수 있음. 양수이면서 0이거나 음수이면서 0인 수가 없다.
}
}
}
*/ 




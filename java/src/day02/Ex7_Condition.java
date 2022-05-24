package day02;

public class Ex7_Condition {

	public static void main(String[] args) {
		/* 조건 선택 연산자 예제
		 * (조건식) ? 참 : 거짓; 
		 * 성적이 A학점이면 A학저므로 출력하고, 아니면 A학점이 아님으로 출력하는 예제
		 */
		int score = 90;
		String isA = (score >= 90 && score<= 100)? "A학점" : "A학점이 아님";
		System.out.println(score + "점은 " + isA);
		
		
	}

}
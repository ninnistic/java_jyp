package day03;

public class Ex7_Switch1 {

	public static void main(String[] args) {
		/*
		 * 홀수 짝수 판별 예제 num을 2로 나누었을 때, 나머지가 0과 같으면 짝수라고 출력하고 아니면 홀수라고 출력한다.
		 * 
		 */

		int num = 3;
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");

		} else {
			System.out.println("홀수입니다.");
		}
		
		switch(num % 2) {
		case 0:
			System.out.println(num + "는 짝수");
			break;									// 중간에 break를 안넣으면, 짝수일 경우에 num이 4라고 치면 case1에 해당되지 않더라도...출력이 된다.
		case 1:									//defualt: 로 할 수도 있음. 
			System.out.println(num + "는 홀수"); 
			break;
		}
		
	
	}

}
	 
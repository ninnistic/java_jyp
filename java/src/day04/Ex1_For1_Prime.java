package day04;

public class Ex1_For1_Prime {

	public static void main(String[] args) {
		/*
		 * 정수 num이 소수인지 아닌지 판별하는 코드를 작성하세요. 소수는 약수가 1과 자기자신인 수, 약수의 개수가 2개인 수 1은 소수가 아님,
		 * 약수가 1개이다. 2는 소수다. 약수가 2개다. 3은 소수다, 1,3 4는 소수가 아님, 1,2,4
		 * 
		 * 
		 * i는 1부터 num까지 1씩 증가 i가 num의 약수이면 약수의 개수를 하나 증가 약수의 개수가 2개이면 소수라고 출력하고 아니면 소수가
		 * 아님이라고 출력한다.
		 */
		int num = 4;
		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num / i == num) {
				count++;
				if (num / num == 1) {
					count++;
				}
			}
			
			}
		if (count == 2) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}

		/*
		 * 선생님 코드. 
		 * for (i=1; count=0; i <= num; i++){
		 * if(num % 1 == 0)  
		 * count++; 
		 * } 
		 * if (count == 2) { 
		 * sysout ( "소수");
		 * } else { ("소수가 아님");
		 * }
		 
		 */
	}
}

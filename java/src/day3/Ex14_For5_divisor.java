package day3;

public class Ex14_For5_divisor {

	public static void main(String[] args) {
		
		/*
		 * 정수 num의 약수를 출력하는 코드를 작성하세요. A의 약수 : A를 어떤 수로 나누었을 떄 나머지가 0과 같은 수. 
		 * 12의 약수 : 1 2 3 4 6 12
		 */

		int num = 12;
		for (int i = 1; i <= 12; i++) { // <=12 라고 썼는데 구체적으로는... 약수를 구하는거니까 12자리에 num을 넣어야 맞겠다.
			if (num % i == 0) {
				System.out.println(i); // 한 줄로 출력하려면 print(i + " ")이 됨.
			}
		}

	}

}

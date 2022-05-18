package day04;

public class Ex6_Break3_LCM {

	public static void main(String[] args) {
		/*
		 * 두 정수의 최소 공배수를 구하는 예제를 작성하세요 공배수 : 두 정수에 공통으로 있는 배수 최소 공배수 : 두 정수의 공배수중 최소값
		 * 10의 배수 : 10 20 30 40 50 15의 배수 : 15 30 45 60...
		 * 
		 * 반복 횟수 : i는 1부터 i는 num1*num2까지 1씩 증가 규칙성 : i가 num1의 배수이고 i가 num2의 배수이면 i를 출력하고
		 * 반복문 종료 반복문 종료후 : 없음
		 *
		 *
		 *
		 */

		int num1 = 2, num2 = 4, i;

		for (i = 1; i <= (num1 * num2); i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				break; // 어떻게 가장 작은 수를 뽑아내나 했더니 그냥 가장 작은거 나오자마자 break하고 깨고 나오면 됐다. 속상한건 난 아직 너무 멀었다 ㅠ
						// 너무 쉽게 생각 할 수 있는걸....어렵게 생각하고 break 이런걸 적절하게 활용을 못한다
			}
		}
		System.out.println(i);
		
		
		// 방법2
		for (i = num1; i <= (num1 * num2); i += num1) {
			if (i % num1 == 0 && i % num2 == 0) {
				break; 
			}
	}
}
}

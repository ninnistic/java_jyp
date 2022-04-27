package day3;

public class Ex13_For4_Sum {

	public static void main(String[] args) {
		/* 1부터 5까지 합을 구하는 코드를 작성하세요.*/
		
		int sum = 0;
		for(int i = 1; i<=5; i++) {
			sum =  sum + i;
		}
		System.out.println(sum);

	/* <선생님 풀이>
	 * sum = 0
		i = 1,2,3,4,5 이걸 다 더하면 됨
	sum = 0 + 1 = i = 1
	sum = 0 + 1 + 2 = i = 3 
	이런식으로 증가 
	
	*
	*/
		
	
	}

}

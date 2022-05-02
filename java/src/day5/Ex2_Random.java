package day5;

public class Ex2_Random {

	public static void main(String[] args) {
		/* 
		 * 0 <= Math.random() < 1 ; 실수
		 * 
		 * 부등호에서 양쪽에 양수를 곱해주면 부등호는 바뀌지 않는다.
		 * 
		 * 0* (max-min+1) < = Math.random()*(max-min+1) < 1* (max-min+1)
		 * 0 <= Math.random() *(max-min+1) < (max-min+1)
		 * 0 + min <= Math.random() *(max-min+1) +min < (max-min+1) + min
		 * min <= Math.random()*(max-min+1) +min < max+1 (maX+1보다 가장 작은 정수중에 큰 수는 max입니다)
		 * */

		int min = 1, max = 10;
		int r;
		
		
		for (int i = 1; i<=10; i++) {
	    r = (int)(Math.random( )* (max-min+1) + min);
		
		System.out.print(r + " ");
		}
	}
}

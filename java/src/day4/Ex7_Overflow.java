package day4;

public class Ex7_Overflow {

	public static void main(String[] args) {
		/* 오버플로우 언더플로우는 정수에서 표현범위를 넘어가는 경우 발생 */
		byte num = 127;
		// byte로 표현가능한 가장 큰 정수 127에 1을 더하면 128이 아닌 -128로 저장이 된다. 
		// 왜냐하면 byte 는 128을 표현할 수 없기 때문이다. 
		// 이러한 현상을 오버플로우라고 한다.
		
		num = (byte)(num+1);
		System.out.println(num);
		// byte 로 표현 가능한 가장 작은 정수 -128에 -1을 하면 -129가 아닌 127이 됨
		// 언더플로우라고 함
		num = (byte)(num-1);
		System.out.println(num);
	}

}

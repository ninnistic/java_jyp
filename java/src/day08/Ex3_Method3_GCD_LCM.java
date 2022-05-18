package day08;

public class Ex3_Method3_GCD_LCM {

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 12;
		int gcd = gcd(num1, num2);
		System.out.println(num1 + "과" + num2 + "의 최대공약수 : " + gcd);

		int a = 6;
		int b = 5;
		int lcm = lcm(12,5);
		System.out.println(lcm);
		
	}

	/* 기능 : 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 : 두 정수가 필요하다, int num1, int num2, 
	 * 리턴타입 :  두 정수의 최대공약수 = 정수
	 * 메소드명 : gcd
	 */
	public static int gcd(int num1, int num2) {
		int gcd = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;

	}

	/* 기능 : 두 정수의 최대 공배수를 알려주는 메소드
	 * 매개변수 : 두 정수 INT
	 * 리턴타입 : 두 정수의 최소 공배수 INT
	 * 메소드명 : lcm
	 */
	public static int lcm(int num1, int num2) {	
		return num1 * num2 / gcd(num1,num2);
	}

}

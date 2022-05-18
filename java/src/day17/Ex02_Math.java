package day17;

public class Ex02_Math {

	public static void main(String[] args) {
		/* 주어진 정수를 입력받아 소수점 둘째 자리에서, 반올림하는 코드를 작성하세요. 
		 * 
		 */
		int num = 2;
		double pi = 3.141592;
		double pi2 = pi * Math.pow(10,  num-1);
		double pi3 = Math.round(pi2) / Math.pow(10, num-1);
		double pi4 = Math.round(pi*Math.pow(10, num-1))/Math.pow(10, num-1);
		System.out.println(pi3);
		System.out.println(pi4);
	
		
		
	}

}

package day02;

public class Ex2_Increase {

	public static void main(String[] args) {
		/* 증감 연산자 : 최종적으로 1 증가 or 1 감소
		 * 전위형 : ++i 증가 후에 동작
		 * 후위형 : i++ 동작 후에 증가
		 */
		int num1 = 10, num2 = 10;
		// num1 = 전위형, num2 = 후위형 
		System.out.println(num1 + "  ,  " + num2);
		System.out.println(++num1 + "  ,  " + num2++); // 콘솔에 출력전에 num1 + 1, 11이 되고 콘솔에 출력. num2는 콘솔에 우선 출력후 +1 
		System.out.println(num1 + "  ,  " + num2);
		
		int num3 = 10, num4 = 10;
		System.out.println(num3 + "  ,  " + num4);
		++num3; // num3++; 해도 결과 똑같음 num3 = num3 + 1;
		System.out.println(num3 + "  ,  " + num4); 
		++num4; // num4++; 해도 결과 똑같음. num4 = num4 + 1;
		System.out.println(num3 + "  ,  " + num4);
		
	}

}

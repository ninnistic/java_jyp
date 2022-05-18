package day08;

public class Ex7_Method5_Overloading {

	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1.2,2.3));
		System.out.println(sum(1.2f,2.3)); //float은 더블로 자동 형변환이 가능해서 알아서 된다
		System.out.println(sum(1.2,3)); // int는 더블로 자동 형변환이 되어서 알아서 간다.
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static double sum(double num1, double num2) {
		return num1 + num2;
	}

}

package day15;

public class Ex15_Method_Extra2 {

	public static void main(String[] args) {
		System.out.println(sum1(10));
		System.out.println(sum1(5,1,2,3));
		System.out.println(sum1(5,1,2,3,4,5,6,7));
		System.out.println(sum1(5,1,2,3,4,5));

	}
	// 가변 인자는 제일 뒤에 와야한다(int ...num은 언제나 가장 매개변수의 뒷자리로 와야함. max랑 자리가 바뀌면 안돼요)
	public static int sum1(int max, int ...nums) {
		if(nums.length == 0 || max == 0) {
			return 0;
		}
		if(max > nums.length) {
			max = nums.length;
		}
		int sum = 0;
		for (int i = 0; i<max; i++) {
			sum += nums[i];
		}
		return sum;
	}
}

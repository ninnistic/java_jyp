package day16;

import java.util.Arrays;

public class Ex14_Arrays {

	public static void main(String[] args) {
		Integer nums[] = {10,2,8,1,5};
		
		System.out.println("정렬 전 배열 : ");
		for(int i =0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(nums); // 오름차순만 가능...

		System.out.println("정렬후 배열");
		for(int i = 0; i <nums.length; i++) {
			System.out.print(nums[i] + "");
			
		}
		System.out.println();
	}

}

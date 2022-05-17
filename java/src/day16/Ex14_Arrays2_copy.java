package day16;

import java.util.Arrays;
import java.util.Comparator;

public class Ex14_Arrays2_copy {

	public static void main(String[] args) {
		Integer nums[] = {10,2,8,1,5};
		
		System.out.println("정렬 전 배열 : ");
		for(int i =0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(nums, new Comparator<Integer>() {		///내림차순으로 하는
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
	});

		System.out.println("정렬후 배열"); 
		for(int i = 0; i <nums.length; i++) {
			System.out.print(nums[i] + " ");
			
		}
		System.out.println();
	}

}

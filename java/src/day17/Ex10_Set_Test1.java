package day17;

import java.util.HashSet;
import java.util.Set;

public class Ex10_Set_Test1 {
	//set 의 특징 : 중복이 안된다. -> 중복을 제거해버림
	// 순서는 보장하지 못한다.
	// 숫자가 작으면 대체로 정렬이 보장되지만, 숫자가 커질수록 정렬되기는 어렵다.
	// 그래서 숫자가 작으면 정렬이 되는 편이기 때문에 숫자야구에는 부적합하다..(숫자야구는 위치도 중요하기 때문이다.)

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			set.add((int) (Math.random() * (15 - 10 + 1) + 10));

		}
		System.out.println(set);

	}

}

package day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex12_Set_Lotto {

	public static void main(String[] args) {
		/* set을 이용하여 1~45 사이의 중복되지 않은 숫자 6개를 저장하고 출력하는 코드를 작성하세요.*/
		Set<Integer> lotto = new HashSet<Integer>();

		int min = 1, max = 10;
		while (lotto.size() < 6) {
			lotto.add((int) (Math.random() * (max - min + 1) + min));
			// 내부에서 중복확인을 알아서 해주기 때문에, 몇번 할지만 결정하면 된다.
		}
		//System.out.println(lotto);

		for (Integer tmp : lotto) {
			System.out.println(tmp + " ");
		}
		System.out.println();
		System.out.println("================");
		
		Iterator<Integer> it = lotto.iterator();
		while (it.hasNext()) {
			Integer tmp = it.next();
			System.out.println(tmp + " ");
		}
		System.out.println();
		System.out.println("===============");
		
		// 구매한 로또 : 
		Set<Integer> user = new HashSet<Integer>();

		/* 스캐너를 이용하여, 정수를 6개 입력받는다. 중복되지 않은 숫자 6개를 입력할 때 까지. 범위는 로또와 같다. */
		Scanner scan = new Scanner(System.in);
		while (user.size() < 6) {
			int num = scan.nextInt();
			if (num >= min && num <= max) {

				user.add(num);

			}
		}
		System.out.println(user);
		System.out.println();
		System.out.println("===============");
		/* lotto와 user에서 일치하는 숫자의 개수를 세서 출력하세요. */
		int i;
		int count = 0;  // set 은 번지를 찾을 수 없다.
		for (Integer tmp : lotto) {
			if(user.contains(tmp)) {
				count++;
			}
		 }
		System.out.println(count +"개 있습니다.");
		
		
		 
	}
}

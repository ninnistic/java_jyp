package day15;

public class Ex17_Exception_Test3 {

	public static void main(String[] args) {
		/* 중복되지 않은 1~9 사이의 세 정수를 랜덤 생성하여, 배열에 저장하고 출력하는 코드를 작성하세요.
		 * 단, 중복되지 않은 1~9 사이의 세 정수를 랜덤으로 생성하여 배열에 저장하는 메소드를 만들어서 활용
		 * 예외처리를 해야함
		 */
		int arr[];
		int min = 1, max = 9;
		int n = 3;
		try {
			arr = creatRandomArray(min, max, n);
			for(int i = 0; i <arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch(Exception e) {
		
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	/* 배열 arr에 n의 요소 중에서 num과 일치하는 값이 으면 true, 전부 확인시 없으면 false*/
	public static boolean contains(int arr[],int n,int num) throws Exception {
		if(arr == null) {
			throw new Exception("배열이 비어있습니다.");
		}
		if(arr.length < n) {
			n = arr.length;
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}

	/*최소 / 최대와 만들어야할 개수가 주어지면 중복되지 않은 랜덤한 값이 들어있는 배열을 만들어서 반환*/
	public static int[] creatRandomArray(int min, int max, int n) throws Exception {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		if(max - min + 1 < n) {
			throw new Exception(min + " 에서 "+ max+" 사이에서 "+n+" 개의 중복되지 않은 배열을 만들 수 없습니다.");
		}
		if(n <= 0) {
			throw new Exception(n+"개의 배열은 만들 수 없습니다.");
		}
		int arr[] = new int[n];
		int count = 0;
		
			while(count < n) {
				int r = (int) (Math.random() * (max - min + 1) + min);
				if (!contains(arr, count, r)) {
					arr[count] = r;
					count++;
				}
			}
		return arr;
	
}
}

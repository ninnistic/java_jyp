package day7;

public class Ex4_Array4_Copy {

	public static void main(String[] args) {
		/* arr2배열을 생성하여 arr1배열을 복사하고, arr2 배열값을 출력하세요. */
		
		int arr1[] = {1,4,6,8};
		int arr2[] = new int[arr1.length];
		int arr3[] = arr1;
		int arr4[] = new int[arr1.length];
		
		for (int i = 0; i< arr1.length; i++) {
			arr2[i] = arr1[i]; // 기억하자 =는 값을 대입한다는 것을 ㅠ.. 또 까먹 
		}
		// arr1의 값들을 메소드를 통해 arr4에 복사.
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		
		arr1[0] = 0;
		System.out.print("arr1 :  ");
		for (int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}
		System.out.println();
		System.out.print("arr2 :  ");
		for (int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println();
		System.out.print("arr3 :  ");
		for (int i = 0; i<arr3.length; i++) {
			System.out.print(arr3[i] + "  ");
		}
		System.out.println();
		System.out.print("arr4 :  ");
		for (int i = 0; i<arr4.length; i++) {
			System.out.print(arr4[i] + "  ");
		}
		System.out.println();
	}

}

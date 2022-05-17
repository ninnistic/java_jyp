package day15;

public class Ex4_Exception_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		//0번지에서 크기-1 까지 해야하는데, 0번지에서 크기번지까지 하는 경우 out of bounds 니까 에러가 뜬다. i < arr.length가 되어야함.
		for(int i = 0; i <= arr.length; i++) {
			//System.out.println(arr[i]); // 예외발생 
		}
		
		// 변수를 이용하여 배열을 제어하는 경우, 변수의 값이 배열의 크기를 넘지 않도록 해야하는데..  넘는 경우 발생할 수 있다...arr크기 이미 5개로 정해져잇
		int num = 10;
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}

	}

}

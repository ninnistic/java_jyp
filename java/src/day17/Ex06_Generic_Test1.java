package day17;

public class Ex06_Generic_Test1 {

	public static void main(String[] args) {
		Array<Integer> array = new Array<Integer>();
		Integer nums[] = {1,2,3,4,5};
		array.setArray(nums);
		array.print();
		Array<String> array2 = new Array<String>();
		String strs[] = {"안녕", "학원", "공부"};
		array2.setArray(strs);
		array2.print();
		}
	}


class Array<T>{
	private T arr[] = (T[])new Object[10];
	private int size = 0; // 현재 저장된 값의 개수
	private int capacity = 10;// 배열의 최대 크기

	public void print() {
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
	}
	public void setArray(T arr[]) {
		//매개변수 배열이 최대 크기보다 큰 배열인지 확인해야한다.
		if(capacity < arr.length) {
			// 배열 크기 확장
		capacity = arr.length;
		//확장된 크기의 새 배열 생성
		T tmp[] = (T[]) new Object[capacity];
		System.arraycopy(this.arr, 0, tmp, 0, this.arr.length);
		this.arr = tmp;
		}
		this.size = size < arr.length ? arr.length : size;
		int count = size < arr.length ? size : arr.length;
		for (int i = 0; i <count; i++) {
			this.arr[i] = arr[i];
		}
		
	}
}

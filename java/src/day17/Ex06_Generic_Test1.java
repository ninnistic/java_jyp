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


class Array<T > { /*extends Number*/ // 이 코드를 추가하면 number클ㄹ래스 또는 상속받은 클래스들만 올 수 있다.>{
	private T arr[];
	private int size; // 현재 저장된 값의 개수
	private int capacity;// 배열의 최대 크기

	public Array() {
		this(10);
	}
	public Array(int capacity) {
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}


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
	/* ?(와일드 카드) : Generic 클래스에서 메소드에 generic클래스의 객체가 오는데, 
	 * Generic 타입이 서로 다른 경우, Method에서 호출할 수 있게 해준다.
	 * 위 예제에서 Integer 타입으로 된 array가 string 타입으로 된 array2를 
	 * 매개변수로 가져와서 print를 실행한다. => 와일드카드 때문에 가능하다.
	 */
	public void print(Array<?> array) {
		array.print();
	}
}

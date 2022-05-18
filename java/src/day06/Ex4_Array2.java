package day06;

public class Ex4_Array2 {

	public static void main(String[] args) {
		
		int [] arr = new int [5];
		// arr 0번지에 1을 저장
		arr[0] = 1;
		//System.out.println(arr[0]);
		arr[1] = 2;
		//System.out.println(arr[1]);
		arr[2] = 3;
		// 5개짜리 배열은 5번지까지 접근 할 수 없기 때문에 아래 두줄은 에외가 발생하는 코드다.
		//arr[5] = 6;
		//System.out.println(arr[5]);
		System.out.println(arr[0]);	
		System.out.println(arr[1]);	
		System.out.println(arr[2]);	
		System.out.println(arr[3]);	
		System.out.println(arr[4]);	
		System.out.println("------------------------------");
		for(int i = 0; i <=4; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------------------");
		for(int i = 0; i<5; i++) {
			System.out.println(arr[i]); // 위의 것 보다는 되도록 이렇게 쓴다. 배열이 5짜리니까 5로 명시화를 하고 5보다 작다. 이게 훨씬 낫다.
		}
		// 그래서 이거를
		for(int i = 0; i<arr.length; i++)  {
			System.out.println(arr[i]);
		}
			// 더 많이 쓴다. 배열은 0번지부터 시작하니까 0부터 시작하는 것도 잊지 말아라. <=arr.length는 말이 되지 않음 왜냐하면 length는 5인데 , arr의 변수 i에는 lenght보다 하나 작은 만큼 들어가기 때문임. 
		// 그러니까 같거나 작다라고 쓰지 않도록 유의해야 한다. 생각!!
	 
		
	
	}

}

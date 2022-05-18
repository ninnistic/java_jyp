package day06;

public class Ex2_Break {

	public static void main(String[] args) {
			int i, j;
			for ( i = 1; i <= 5; i ++) {
				for ( j = 1; j <= 5; j++) {
					System.out.println(i + " ,  " + j);
					if (j == 3) {
						break;                         
					}
				}
				//break를 만나면 이 위치로 이동한다. 왜냐하면 break는 중첩 반복문에서 가장 가까운, 가장 내부의 반복문만 빠져나간다.
				
			}
				System.out.println("------------------------------------------");
				out:for ( i = 1; i <= 5; i ++) {
					for ( j = 1; j <= 5; j++) {
						System.out.println(i + " ,  " + j);
						if (j == 3) {
							break out;                         
						}
					}
					//break를 만나면 out반복문의 끝이 이 위치로 이동한다. (각 반복문은 이름을 붙일 수 있다.)
					
				}
	}

}

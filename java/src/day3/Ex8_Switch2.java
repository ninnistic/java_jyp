package day3;

public class Ex8_Switch2 {

	public static void main(String[] args) {
		/* 월이 주어졌을 때 주어진 월의 마지막 일을 출력하는 코드를 작성하세요.(switch문) 
		 * 31 : 1,3,5,7,8,10,12
		 * 30 : 4,6,9,11
		 * 28 : 2
		 * 
		 * */
		
		int month = 4; 
				
		switch(month) {
		case 4 : 
		case 6 :
		case 9 :
		case 11:
			System.out.println("30일 입니다.");
			break;
		case 2 :
			System.out.println("28일 입니다.");
			break;
		default: 
			System.out.println("31일 입니다."); //13월이나 0월을 설명하지 못함 (break를 쓰지 않으면 내려가는 것을 응용하면 된다)
		}
		

		/* 선생님 코드
		 * 
		 * switch(month) {
		 * case 1:
		 * 	sysout ("30일")
		 * case 2: 
		 *  sysout ("28일")
		 * case 3:
		 *  sysout ("31일")
		 이렇게 달별로 만든다음에
		 default로 유효하지 않은 달을 설정하면 됨.
		 
			
		그러나 더 효율적인 것은!
		
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			sysout ("31일") 
			break;
			case 2: 
			sysout("28일")
			case 4: case 6: case 9: case 11:
			sysout("30일")
			default  :
		  	sysout("없는달")
		  	
		  	이렇게 해버리면 case1 다음에 break 까지 게속 내려가서 sysout 31일로 나오게 된다.
		  	근데 그냥 case 1,3,5,7,8,10,12 : 로 더 효율적으로 해도됨
		  	브레이크 걸릴 떄 까지 계속 타고 내려간다는 것을 명심하세요오옥
		
		 */
	}

}

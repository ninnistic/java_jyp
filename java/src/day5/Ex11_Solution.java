package day5;

import java.util.Scanner;

public class Ex11_Solution {

	public static void main(String[] args) {


		int com1 = 3, com2 = 8, com3 = 9;
		int user1, user2, user3;
		Scanner scan = new Scanner(System.in);
		int s = 0, b = 0;
		while ( s < 3) {
			System.out.print("1에서 9사이의 정수를 중복되지 않게 입력하세요. : ");
			user1 = scan.nextInt();
			user2 = scan.nextInt();
			user3 = scan.nextInt();
			
			if (com1 == user1) {
				s++;
			} 

			if (com2 == user2) {
				s++;
			} 

			if (com3 == user3) {
				s++;
			} 
			
			if (com1 == user2 || com1 == user3) {
				b++;
			}
			if (com2 == user1 || com2 == user3) {
				b++;
			}
			if (com3 == user1 || com3 == user2) {
				b++;
			}
			
			if(s != 0) {
				System.out.print(s+ "S");
			}
			if (b != 0) {
				System.out.println(b + "B");
			}
			if(s == 0 && b == 0) {
				System.out.println("OUT");
			
			}
			System.out.println();
		}

	}

}

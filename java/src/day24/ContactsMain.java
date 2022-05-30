package day24;

import java.util.Scanner;

public class ContactsMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContactsAdmin ca = new ContactsAdmin(scan);
		ca.run();
		scan.close();
	}

}

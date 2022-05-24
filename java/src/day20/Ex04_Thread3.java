package day20;

public class Ex04_Thread3 {

	public static void main(String[] args) {
		/* 한 계좌에서 동시에 2명이 접근해서 1000원을 빼갈 때 생길 수 있는 문제점 
		 * 두개 이상의 스레드가 하나의 자원을 같이 이용하는 경우 생길 수 있는 문제점 */

		BankAccount account = new BankAccount(10000);
		User user1 = new User(account);
		user1.start();

		User user2 = new User(account);
		user2.start();

	}

}

class User extends Thread {
	BankAccount account;

	public User(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(1000);
	}
}

class BankAccount {
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	//출금
	// synchronized 동기화
	// 메소드를 동기화하면 어떤 쓰레드가 동기화 메소드를 실행하고 있으면
	// 다른 쓰레드에서 해당 메소드를 접근할 때, 실행이 다 끝날 때 까지 일시정지(대기) 했다가(Blocked)
	// 다 끝나면 그제서야 사용을 할 수 있다.

	public synchronized void withdraw(int money) {
		this.money -= money;
		try {
			Thread.sleep(1000);
			System.out.println("남은 잔액 : " + this.money);
		} catch (InterruptedException e) {
		}
	}

	public void withdraw2(int money) {
		synchronized (this) {
			this.money -= money;
			try {
				Thread.sleep(1000);
				System.out.println("남은 잔액 : " + this.money);
			} catch (InterruptedException e) {
			}
		}
	}

	public BankAccount(int money) {
		this.money = money;
	}
}

package day13;

public class Ex1_Interface1 {

	public static void main(String[] args) {
		//Controller con = new COntroller();//에러 발생 : 인터페이스로 객체를 생성할 수 없다. 
		Controller rc = new RemoteController();
		rc.print();
		rc.run();
		rc.print();
		rc.stop();
		rc.print();

		Controller rc2 = new Controller() {

			@Override
			public void stop() {
				System.out.println("중지");
			}

			@Override
			public void run() {
				System.out.println("시작");
			}

			@Override
			public void print() {
				System.out.println("출력");
			}
		};
	}
}

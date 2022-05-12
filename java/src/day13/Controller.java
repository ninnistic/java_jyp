package day13;

public interface Controller {
	//(public static final)이 생략되었다. int num; // 초기화가 되지 않으면 에러가 난다.
	int MIN = 1; // 상수는 일반적으로 전부 uppercase로 쓴다. / public static final이 자동으로 앞에 붙는다. 
	void run(); // public abstract가 앞에 자동으로 붙는다.
	void stop();
	void print();
	default void test() {}
	
}

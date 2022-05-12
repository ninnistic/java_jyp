package day12;

public class Car {
	private Tire tire[];

	public Car(Tire[] tire) {
		this.tire = tire;
		
	}
	public void print() {
		if (tire == null) {
			return; 
		}
		for(Tire tmp : tire) {
			if(tmp instanceof HankookTire) {
				System.out.println(HankookTire.COMPANY+ " : ");
			}else if (tmp instanceof KumhoTire) {
				System.out.println(KumhoTire.COMPANY + " : ");
			}
			System.out.println( " 입력 : " + tmp.getPressure() + ", 상태 : "  + tmp.getState()+ " " + tmp.getPosition());
		}
	}
	public void repair(int index, Tire tire ) {
		if( this.tire == null || this.tire.length <= index ) {
			return;
		}
		this.tire[index] = tire;
	}
}

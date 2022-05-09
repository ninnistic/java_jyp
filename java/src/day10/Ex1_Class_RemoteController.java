package day10;

import java.util.Scanner;

public class Ex1_Class_RemoteController {

	public static void main(String[] args) {
		
		/* 메뉴를 출력후 메뉴에 맞는 기능을 동작하도록 코드를 작성하세요.
		 * 메뉴 
		 * 1. 채널 Up
		 * 2. 채널 Down
		 * 3. 채널 변경
		 * 4. 볼륨 Up
		 * 5. 볼륨 Down
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요 : 6
		 * tv를 켰습니다.
		 * 메뉴 
		 * 1. 채널 Up
		 * 2. 채널 Down
		 * 3. 채널 변경
		 * 4. 볼륨 Up
		 * 5. 볼륨 Down
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요 : 3
		 * 채널 입력 : 100
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		RemoteController rm = new RemoteController(1,10);
		int menu = 0;
		int num = 0; 
		for ( ; menu != 7 ; ) {
			System.out.println("메뉴\n1. 채널up\n2. 채널down\n3. 채널변경\n4. 볼륨up\n5. 볼륨down\n6. 전원\n7. 종료");
			System.out.println("메뉴를 선택하세요. : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1 : rm.channelUp(); break;
			case 2 : rm.channelDown();  break;
			case 3 :
				System.out.println("채널 입력"); 
				int ch = scan.nextInt();
				rm.channel(ch);
				break;
			case 4 : rm.volumeUp(); break;
			case 5 : rm.volumeDown(); break;
			case 6 : rm.turn(); break;
			case 7 :
			System.out.println("프로그램 종료");
			break; 
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}
		
		scan.close();
	}

}

/* TV 리모컨 클래스를 생성하고, 객체를 생성 후 기능들을 테스트해보세요. */

class RemoteController {
	/*
	 * 전원, 채널, 볼
	 */
	boolean power; // on/off
	int channel;
	int volume;
	int minVolume = 0;
	int maxVolume = 32;
	int minChannel = 1;
	int maxChannel = 999;

	/*
	 * 기능 : tv를 켜는 메소드 매개변수 : 없음 리턴타입 : 없음 메소드명 :turnOn
	 */
	void turnOnOn() {
		power = true;
		System.out.println("Tv를 켰습니다.");
	}

	/*
	 * 기능 : tv를 켜는 메소드 매개변수 : 없음 리턴타입 : 없음 메소드명 :turnOn
	 */
	void turnOnOff() {
		power = false;
		System.out.println("Tv를 껐습니다.");
	}

	/*
	 *  기능 : tv를 키거나 끄는 메소드 
		매개변수 : 없음 // 없는 이유가, 켜져있으면 꺼지고 꺼져있으면 켜야한다...opposite 
		리턴타입 : 없음 => void 
		메소드명 turn
	 */
	void turn() {
		power = !power; // not 연산자를 이용해서 반대를 구현한다.
		if (power) {
			System.out.println("Tv를 켰습니다.");
		} else {
			System.out.println("Tv를 껐습니다.");

		}
	}

	/*
	 * 기능 : 소리를 한칸 올리는 기능 
	 * 매개변수 : 버튼을 누르면 한 칸 씪 올리면 됨 그래서 없 
	 * 리턴타입 : 없 (필드의 값을 바꾸는 경우
	 * 리턴타입이 void 입니다.) 
	 * 메소드명 : volumeUp
	 */
	void volumeUp() {
		// 전원이 켜져있고, 소리가 최대치가 아니면 (전원이 꺼져있으면 볼륨업 할 필요도 없다.)
		if (power) {
			if (volume < maxVolume)
			volume++;
			
		}
		System.out.println("소리 : " + volume);
	}

	/*
	 * 기능 : 소리를 한칸 내리는 기능 
	 * 매개변수 : 버튼을 누르면 한 칸 씩 내림. 
	 * 리턴타입 : 없 (필드의 값을 바꾸는 경우 리턴타입이 void
	 * 입니다.) 메소드명 : volumeDown;
	 */
	void volumeDown() {
		// 전원이 켜져있고, 소리가 최소치가 아니면! // 이중 반복문으로 하면 0이 보인다. 
		if (power) {
			if( volume > minVolume)
			volume--;
			
		}
		System.out.println("소리 : " + volume);
	}

	/* 기능  : 채널을 1씩 증가하는 메소드
	 * 리턴타입 : 없
	 * 매개변수 : 없
	 * 메소드명 ChannelUp 
	 */
	void channelUp() {
		if(power) {
			if(channel < maxChannel) {
				channel++;
			}
			System.out.println("채널 : " + channel);
		}
	}
		/* 기능  : 채널을 1씩 감하는 메소드
		 * 리턴타입 : 없
		 * 매개변수 : 없
		 * 메소드명 ChannelDown
		 */
	void channelDown() {
		if(power) {
			if(channel > minChannel) {
				channel--;
			}
			System.out.println("채널 : " + channel);
		}
	}
	/* 기능 : 입력한 채널로 이동하는 메소드
	 * 매개변수 : 이동할 채널 = int ch
	 * 리턴타입 : 없음 = void 
	 * 메소드명 : channel 
	 */
	void channel(int ch) {
		if(power) {
			if(ch < minChannel) {
				channel = minChannel;
			}
			else if (ch > maxChannel) {
				channel = maxChannel; //999를 초과하면 그냥 가장 가까운 999채널로 이동시
			}else {
				channel = ch;
			}
			System.out.println("채널 : " + channel);
		}
	}
	// constructor
	// 생성자가 없으면, 기본 생성자가 호출이 된다.
	// 생성자가 하나라도 있으면 기본 생성자는 자동으로 생성이 안된다. 
	//public RemoteController() {}
	public RemoteController() {
		channel = minChannel;
		volume = minVolume;
	} // 기본 생성자 
	public RemoteController(int ch, int v) {
		if (ch >= minChannel && ch <= maxChannel) {
			channel = ch;
		} else {
			channel = minChannel;
		}
		if ( v >= minVolume && v <= maxVolume) {
			volume = v;
		} else {
		 volume = minVolume;
		}
	}
}
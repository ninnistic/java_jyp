package day16;

public class Ex09_String_EndWith {

	public static void main(String[] args) {
		/* 다음과 같이 파일이름이 주어졌을 때, 파일 이미지인지 아닌지 구별하는 코드를 작성하세요. 
		 * 파일 확장자가 .jpg / .png / .bmp인 경우 이미지로 판별 */

		String fileName = "test.jpg.txt";

		///---------------------------------------------방법 1 (switch문) ----//
		
		// 끝에서부터 . 을 찾는다.
		// 가져온 문자열이 jpg, png, bmp인지 찾는다
		// 셋중에 같은게 있으면 이미지, 없으면 아니다.

		
		
		int index = fileName.lastIndexOf(".");
		if (index != -1) {
			String endwith = fileName.substring(index + 1); //.이후만 살피는 것, dot을 포함해서 보고싶다면 1을 없애야함.	
			switch (endwith) {
			case "jpg", "bmp", "png":
				System.out.println(fileName + "은 이미지입니다.");
				break;
			default:
				System.out.println(fileName + "은 이미지가 아닙니다.");
			}

		} else {
			System.out.println(fileName + "은 이미지가 아닙니다.");
		}
		
		///---------------------------------------------방법 2(반복문)----// Gitcheck
		//배열에 넣어서 생각하는 방법도 있다!!
		
		String img[] = {"jpg","bmp","png"};
		
		
		if (index != -1) {
			String endwith = fileName.substring(index +1); //.이후만 살피는 것, dot을 포함해서 보고싶다면 1을 없애야함.	
			int i;
			for(i = 0; i <img.length; i++) {
				if(img[i].equals(endwith)) {
					break;
				}
			}
			if(i <= img.length) {
				System.out.println(fileName + "은 이미지입니다.");
			}

		} else {
			System.out.println(fileName + "은 이미지가 아닙니다.");
		}
		///---------------------------------------------방법 3(반복문, endwith)----//
		/* 문자열1.endWith(문자열2) : 문자열 1이 문자열2로 끝나는지 알려준다(참/거짓)*/
		
		String img2[] = {".jpg", ".bmp", ".png"};
		int i;
		for(i = 0; i<img2.length; i++) {
			if(fileName.endsWith(img2[i])) {
				break;
			}
		}
		if(i < img2.length ) {
			System.out.println(fileName + "은 이미지입니다.");
		}else {
			System.out.println(fileName + "은 이미지가 아닙니다.");
		}
		
		///---------------------------------------------방법 4(without substring)----//

		int length = fileName.length();
		
		for(i = 0; i < img2.length; i++) {
			index = fileName.lastIndexOf(img2[i]);
			if(index == length - img2[i].length()) {
				break;
			}
		}
		if(i < img2.length) {
			System.out.println(fileName + "은 이미지입니다.");
		} else {
			System.out.println(fileName + "은 이미지가 아닙니다.");
		}
	}



}

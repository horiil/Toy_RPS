package Rock_Scissors_Paper;

import java.util.Random;

//사용자와 겨룰 가위바위보 랜덤 값 출력.
	public class Rand {
			// 랜덤값을 주는 random 객체 생성
			Random rand = new Random();
			// 랜덤값을 받을 int형 변수 생성
			private int num ;
			
			
			Rand() {
				// 
				// 랜덤값의 범위를 3으로 설정함으로 0 ~ 2 사이의 값만 나오게 된다.
				num = rand.nextInt(3);
			}
			
			int getNum() {
				return num;
			}
	}
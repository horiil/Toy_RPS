package Rock_Scissors_Paper;

// 랜덤 값
public class RSP {
	// 가위=0, 바위=1, 보=2
	int user;
	int com;

	// main클래스에서 생성자를 불러와서 RSP클래스의 기능을 사용할 예정
	public RSP(int user, int com) {
		this.user = user;
		this.com = com;
	}

	// 가위바위보 승리규칙

	public void result() {
		// 무승부일 경우
		if (user == com) {
			System.out.println("세상에. 무승부에요!");
		}

		// 사용자가 0(가위)를 선택할 경우
		if (user == 0) {
			if (com == 1)
				System.out.println("이겼습니다.!");
			else if (com == 2)
				System.out.println("아..졌어요!");
		}

		// 사용자가 1(바위)를 선택할 경우
		if (user == 1) {
			if (com == 0)
				System.out.println("이겼습니다.!");
			else if (com == 2)
				System.out.println("아..졌어요!");
		}

		// 사용자가 2(보)를 선택할 경우
		if (user == 2) {
			if (com == 0)
				System.out.println("아..졌어요!");
			else if (com == 1)
				System.out.println("이겼습니다.!");
		}

	} // 승리규칙 끝;

	// 가위(0) , 바위(1), 보(2)
	// 입력받은 0 ~ 2값을 String타입으로 바꿔서  [가위 / 바위 / 보] 로 return 한다.
	String getString(int num) {
		if (num == 0)
			return "가위";
		else if (num == 1)
			return "바위";
		else
			return "보";

	}
	
	
}

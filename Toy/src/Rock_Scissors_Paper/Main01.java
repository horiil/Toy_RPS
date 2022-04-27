package Rock_Scissors_Paper;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bl = true;

		// BGM 객체 생성 및 사용
		BGM mi = new BGM();
		while (true) {
			try {
				mi.music();
			} catch (Exception e) {

			}

			while (bl) {
				Rand rd = new Rand();
				int user;
				System.out.println("_________________________________________________");
				System.out.println(" 가위 바위 보 게임을 시작합니다.!!!");
				System.out.println(" 0 ~ 2 사이의 숫자를 입력하세요  \t(가위 = 0, 바위 = 1, 보 = 2) ");
				System.out.println("_________________________________________________");
				System.out.println();
				while (true) {
					String scStr = sc.nextLine();

					if (Pattern.matches("[\\D]*", scStr)) {
						System.out.println("잘못된 입력형식입니다. 다시 입력하세요");
						System.out.println("0~2 사이의 숫자를 입력해주세요" + "(가위 = 0, 바위 = 1, 보 = 2)");
						System.out.println("_________________________________________________");
						System.out.println();
					} else {
						// String 타입을 int 타입으로 바꾸기.
						user = Integer.parseInt(scStr);

						// 입력받는 숫자가 0 ~ 2 사이가 아니라면 다시 입력시키기
						if (user < 0 || user > 2) {
							System.out.println("잘못된 입력형식입니다. 다시 입력하세요");
							System.out.println("0~2 사이의 숫자를 입력해주세요" + "(가위 = 0, 바위 = 1, 보 = 2)");
							System.out.println("_________________________________________________");
							System.out.println();
						}
						// 조건에 맞다면 break;
						else {
							break;
						}
					}
				}

				int com = rd.getNum();
				// RSP의 기능을 사요하기 위해 객체 생성
				RSP rsp = new RSP(user, com);

				// 사용자가 선택한 값 출력
				System.out.println("사용자 : " + rsp.getString(user));
				// 선택된 랜던값 출력
				System.out.println("AI : " + rsp.getString(com));

				// 게임의 결과 출력
				rsp.result();

				// 게임을 반복할 것인지 선택지 출력
				System.out.println("또 할거에요? [Y/N] ");
				System.out.println();

				// 선택지
				while (true) {
					String re = sc.nextLine();

					// Y, y 를 입력하면 재시작
					if (re.equals("y") || re.equals("Y")) {
						System.out.println("RESTART! 게임을 실행합니다.");
						break;

						// N, n 을 입력하면 종료
					} else if (re.equals("n") || re.equals("N")) {
						System.out.println("-END-");
						// 입력문 종료
						sc.close();
						// 게임 종료이기 때문에 반복문의 bl(boolean)값을 false로 바꿔줌
						bl = false;
						break;
					} else {
						System.out.println("잘못된 형식입니다. 다시 입력하세요. [Y/N] ");
					}
				}
			}
		}
	}
}

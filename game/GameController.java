package com.jse.game;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.jse.member.Kaup;
import com.jse.util.Calculator;
import com.jse.util.Constants;


public class GameController {
	static String test;
	public static void main(String[] args) {//args 외부에서 투입되는 것 파라미터지만 로컬변수.

		Scanner scanner = new Scanner(System.in); //scanner 로컬변수이며, 인스턴스변수(다른 곳에서)
		Random random = new Random();
		Member member = new Member();
		Calculator calculator = null; 
		Dice dicegame = null; 
		RPS rpsGame = null;
		Service upDown;
		Kaup kaup = null;
		//인스턴트를 만들었다. instantiation.
		while(true) {//모든 서버는 이 위에서 돌아간다.
			
			switch(JOptionPane.showInputDialog(Constants.CARD2_MENU)) {
			case "0": System.out.println("종료"); 
					return;
			case "1": 
					System.out.println("회원가입");
					System.out.println("ID 입력");
					member.setId(scanner.next());
					break;
					
			case "2": 
					System.out.println("로그인");
					System.out.println("ID 입력");
					System.out.println("로그인된 아이디 " + member.getId());
					if(scanner.next().equals(member.getId())) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("로그인 실패");
					}
					break;
			case "3": 
				calculator = new Calculator();
					System.out.println("계산기");
					System.out.println("첫 번째 수 입력");
					calculator.setNum1(scanner.nextInt());
					System.out.println("두 번째 수 입력");
					calculator.setNum2(scanner.nextInt());
					System.out.println("두수의 합: "+calculator.calc());
					break;
			case "4":
				dicegame = new Dice();
					System.out.println("주사위 홀짝 맞추기 게임");
					System.out.println("기대하는 홀/짝 값을 입력해주세요.");
					String expect = scanner.next();
					System.out.println(String.format("사용자가 입력한 값: %s ", expect));
					dicegame.setUser(expect);
					int dice = random.nextInt(6)+1;
					System.out.println(String.format("주사위의 값: %d ", dice));
					dicegame.setRandomNum(dice);
					System.out.println(String.format("결과: %s ", dicegame.switchDice()));
					break;
			case "5": 
				 rpsGame = new RPS();
					System.out.println("가위(1), 바위(2), 보(3) 을 입력하세요.");
					int play = scanner.nextInt();
					if(play <=3) {
					rpsGame.setPlay(play);
					}else {
						System.out.println("잘못된 값을 입력하셨습니다.");
						break;
					}
					rpsGame.setCom(random.nextInt(3)+1);
					System.out.println("결과는\n" + rpsGame.game());
					break;
			case "6":
				upDown = new Service();
					System.out.println("##맞춰보자 업 아니면 다운 !##\n "
							+ "~컴퓨터가 생각하는 숫자를 맞춰보세요~\n"
							+ "1~10 사이의 수입니다.");
					int computNum = random.nextInt(10)+1;
					upDown.setcompNum(computNum);

					int inputNum = scanner.nextInt();
					upDown.setuserNum(inputNum);
					System.out.println("입력한 숫자: "+inputNum);
					String upDownresult = upDown.UpAndDown();		
					System.out.println("결과: "+ upDownresult);
					
					break;
					case "7":
					kaup = new Kaup();
					System.out.println("카우푸지수 계산기");
					System.out.println("키(cm)를 입력해주세요");
					kaup.setHi(scanner.nextDouble());	
					System.out.println("몸무게(kg)를 입력해주세요");
					kaup.setWet(scanner.nextDouble());
					System.out.println(kaup.kaup());
					System.out.println("당신의 KaupIndex는 "+ kaup.getKa());
					break;
		}
	}
}
}


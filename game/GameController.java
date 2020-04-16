package com.jse.game;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.jse.member.Kaup;
import com.jse.member.Member;
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
		UpDown upDown;
		Kaup kaup = null;
		//인스턴트를 만들었다. instantiation.
		while(true) {//모든 서버는 이 위에서 돌아간다.
			
			switch(JOptionPane.showInputDialog(Constants.GAME_MENU)) {
			case "0":JOptionPane.showMessageDialog(null, "종료"); return;
			case "1": 
					System.out.println("회원가입");
					System.out.println("ID 입력");
					member.setUserid(scanner.next());
					break;
					
			case "2": 
					System.out.println("로그인");
					System.out.println("ID 입력");
					System.out.println("로그인된 아이디 " + member.getUserid());
					if(scanner.next().equals(member.getUserid())) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("로그인 실패");
					}
					break;
			case "3":
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
			case "4": 
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
			case "5":
				upDown = new UpDown();
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

		}
	}
}
}


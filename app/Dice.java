package com.jse.app;
public class Dice {
	private String user;
	private int diceNumber;
	public void setUser(String input) {
		this.user = input;
	}
	public String getUser() {
		return user;
	}
	public void setRandomNum(int diceNumber) {
		this.diceNumber = diceNumber;
	}
	public int getRandomNum() {
		return diceNumber;
	}

	public String switchDice() {
		String result = "";
		switch(diceNumber) {//카테고리컬한 변수는 스위치를 사용.
			case 1:case 3:case 5: result = "홀"; break;	
			case 2:case 4:case 6: result = "짝"; break;	
		}
		String result2 = "틀림";
		if(user.equals(result)) {
			result2 = "맞음";
		}
		return result2;
	}
	
}
	
	// ;하나가 익스프레션, {블록}으로 묶인 익스프레션이 statement이다. 
//	static void ifdice(){
//		System.out.println("주사위 홀짝 맞추기 게임");
//		System.out.println("기대하는 값 홀/짝을 입력해 주세요");
//		Scanner scanner = new Scanner(System.in);
//		String expect = scanner.next();
//		System.out.println("예상값 : "+expect);
//		Random random = new Random();
//		int dice = random.nextInt(6)+1;
//		System.out.println("결과값 : "+dice);
//		String result;
//		if(dice%2==0) {
//			result = "짝";
//			System.out.println("결과는 "+result+"입니다.");
//		}else {
//			result = "홀";
//			System.out.println("결과는 "+result+"입니다.");
//			}
//		if(expect.equals(result)) {// object type 의 operation은 nethod로 처리.
//			System.out.println("정답");
//		}else {
//			System.out.println("오답");
//		}
//	}
//	
//	static void switchDice2() {
//		System.out.println("***재미있는 주사위 홀짝게임***");
//		System.out.println("홀/짝 골라보세요!");
//		Scanner scanner = new Scanner(System.in);
//		String expect = scanner.next();
//		System.out.println(String.format("당신이 선택한 것은 %s ", expect));
//		Random random = new Random();
//		int dice = random.nextInt(6)+1;
//		System.out.println(String.format("주사위의 눈은 %d ", dice));
//		String result = "";
//		switch(dice) {
//		case 1:  break;
//		}
//		System.out.println("따라서 주사위는  ");
//		System.out.println("맞췄습니다!");
//		System.out.println("틀렸습니다! ");
//	}
//	//class 안에는 method 뿐이기 때문에 statement가 아니다.
//}//짝수면 0, 홀수면 1. 입력된 expect값을 가져와서 결과값과 대조하여 정답, 오답이 나와야 함.
package com.jse.app;

public class Member {//class는 변수, 메서드, 컨스트럭터가 있어야함. 
	private String id; //멤버변수이며 인스턴스 변수 (다이나믹 멤버 변수) static이 안붙음.
	//주소의 개념, reference 참조변수
	public Member() {//constructor 는 method의 종류.
	
}//Member가 빠지면 statement다.
	public void setId(String id) {//멤버 메서드, 인스턴스 메서드
		System.out.println("local variable 들어옴 :" +id);
		this.id	= id; // 앞:인스턴스 뒤:로컬변수
		System.out.println("instance variable에 저장됨 :"+this.id);
	}//	synchronized() {} //statement
	public String getId() {//필드의 타입과 반환값 일치해야 함.
		return this.id;
	}
	
}

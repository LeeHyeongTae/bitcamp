package com.jse.grade;
import lombok.Data;
/*
 클라이언트에서 프로그램 개발 요청이 왔습니다. 
 * 이름과 국,영,수 세과목점수를 입력받아서() [홍길동 : 총점 ***점, * 평균***점,학점 : F] 
 *  단) 평균은 소수점이하는 절삭합니다 
 *  평균점수가 90점 이상 A 
 *  * 80점 이상이면 B 
 *  70점 이상이면 C 
 *  60점 이상이면 D 
 *  50점 이상이면 E 
 *  50점 미만이면 F 학점입니다
 *  라고 출력되게 해주세요
 * */
@Data
public class Grade {
	private String name;
	private int korean, english, math, java;
	public Grade(String name, int korean, int english, int math, int java) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.java = java;
	}
	
}


package com.jse.swing;
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
public class GradeBean {
	private int korean;
	private int english;
	private int math;
	private String name;
	public GradeBean(String names, int koreans, int englishs, int maths) {
		name = names;
		korean = koreans;
		english = englishs;
		math = maths;
	}
	
	public void setKor(int setkor) {
		korean = setkor;
	}
	
	public int getKor() {
		return korean;
	}
	
	public void setEng(int setEng) {
		english = setEng;
	}
	
	public int getEng() {
		return english;
	}
	
	public void setMat(int setMat) {
		math = setMat;
	}
	
	public int getMat() {
		return math;
	}
	
	public void username(String names) {
		name = names;
	}
	
	public String getName() {
		return name;
	}
	public int sumSubject() {
		return korean+english+math;
	}
	public int avgSubject() {
				int avg = sumSubject() / 3;
				return avg;
	}
	public String gradeResult() {
		String result = "A";
		int avgrage = avgSubject();
		if(avgrage<50) {
			result = "F";
		}else if(avgrage<60) {
			result = "E";
		}else if(avgrage<70) {
			result = "D";
		}else if(avgrage<80) {
			result = "C";
		}else if(avgrage<90) {
			result = "B";
		}
		return result;
	}
	public String switcase() {
		String result = "F";
		switch(avgSubject()/10) {
		case 5: result = "E";
			break;
		case 6: result = "D";
			break;
		case 7: result = "C";
			break;
		case 8: result = "B";
			break;
		case 9: result = "A";
			break;
		}
		return result;
	}
}

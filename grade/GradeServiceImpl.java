package com.jse.grade;

public class GradeServiceImpl implements GradeService {

	private Grade[] grades;
	private int count;
	public GradeServiceImpl() {
		grades = new Grade[3];
		count = 0;
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public Grade[] getGrades() {
		return grades;
	}
	@Override
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
		
	}
	@Override
	public int sumSubject(Grade grade) {
		return grade.getKorean()+grade.getEnglish()+grade.getMath()+grade.getJava();
				}
	@Override
	public int avgSubject(Grade grade) {
		
		return sumSubject(grade)/4;
	}
	@Override
	public String record(Grade grade) {
		String result = "A";
		int avgrage = avgSubject(grade);
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
	@Override
	public String printGrades() {
		String result ="";
		for(int i=0; i<3; i++) {
		result += String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]\n", 
				grades[i].getName(), 
				sumSubject(grades[i]), 
				avgSubject(grades[i]), 
				record(grades[i]));
		}
		return result;
	}
	@Override
	public String ranking() {
//		if(grades[0].sumSubject()>grades[1].sumSubject()) {
//			
//			if(grades[1].sumSubject()>grades[2].sumSubject()) {
//				System.out.println(String.format("%s, %s, %s", 
//						members[0].getName(), members[1].getName(), members[2].getName()));
//			}else if(grades[0].sumSubject()>grades[2].sumSubject()) {
//				System.out.println(String.format("%s, %s, %s", 
//						members[0].getName(), members[2].getName(), members[1].getName()));
//			}else {
//				System.out.println(String.format("%s, %s, %s", 
//						members[2].getName(), members[0].getName(), members[1].getName()));
//			}
//			
//		}else if(grades[0].sumSubject()>grades[2].sumSubject()) {
//			System.out.println(String.format("%s, %s, %s", 
//					members[1].getName(), members[0].getName(), members[2].getName()));
//		}else if(grades[1].sumSubject()>grades[2].sumSubject()){
//			System.out.println(String.format("%s, %s, %s", 
//					members[1].getName(), members[2].getName(), members[0].getName()));
//		}else {
//			System.out.println(String.format("%s, %s, %s", 
//					members[2].getName(), members[1].getName(), members[0].getName()));
		return null;

	
	}
	}

	
	
	


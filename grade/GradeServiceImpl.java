package com.jse.grade;

public class GradeServiceImpl {
	private Grade[] grades;
	private int count;
	public GradeServiceImpl() {
		grades = new Grade[3];
		count = 0;
	}
	public Grade[] getGrades() {
		return grades;
	}
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}
}

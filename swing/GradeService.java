package com.jse.swing;

public class GradeService {
	private GradeBean[] grades;
	public GradeService() {
		setGrades(new GradeBean[10]);
	}
	public GradeBean[] getGrades() {
		return grades;
	}
	public void setGrades(GradeBean[] grades) {
		this.grades = grades;
	}
}

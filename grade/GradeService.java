package com.jse.grade;

public interface GradeService {
	public void add(Grade grade);
	public void setGrades(Grade[] grades);
	public Grade[] getGrades();
	public int getCount();
	public void setCount(int count);
	public int sumSubject(Grade grade);
	public int avgSubject(Grade grade);
	public String record(Grade grade);
	public String printGrades();
	public String ranking();
	}


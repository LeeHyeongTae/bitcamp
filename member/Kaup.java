package com.jse.member;
//카우프지수 = 체중(g)*10 / 신장(m)2
//13이하 : 영양실조 13 ~ 15 : 여윔15 ~ 18 : 정상18 ~ 20 : 과체중20이상 : 소아비만
public class Kaup {
	private double height;
	private double weight;
	private double kaupindex;
	
	public void setHi(double hi) {
		height = hi/100;
	}
	public double getHi() {
		return height;
	}
	public void setWet(double wi) {
		weight = wi;
	}
	public double getWi() {
		return weight;
	}
	public void setKaup(double ka) {
		kaupindex = ka;
	}
	public double getKa() {
		return kaupindex;
	}
	public String kaup() {
		String result = "잘못 입력된 값";
		kaupindex = weight/(height*height);
		
		if (kaupindex<18.5) {
			result = "저체중";
		}else if(kaupindex<23.0) {
			result = "정상체중";
		}else if(kaupindex<25.0) {
			result = "과체중";
		}else if(kaupindex<30.0) {
			result = "비만 1단계";
		}else if(kaupindex<40.0) {
			result = "비만 2단계";
		}else {
			result = "비만 3단계";
		}
		return "결과는 " + result + "입니다.";
	}
}

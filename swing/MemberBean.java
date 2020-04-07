package com.jse.swing;

public class MemberBean {
	private String userid;
	private String passwd;
	private String name;
	private int age;
	
	public MemberBean(String setUserid,String setpasswd,String setName,int setAge) {
		userid = setUserid;
		passwd = setpasswd;
		name = setName;
		age = setAge;
	}
	public void setUserid(String setUserId) {
		userid = setUserId;
	}
	public String getUserid() {
		return userid;
	}
public void setUserPasswd(String setUserPw) {
		passwd = setUserPw;
	}
	public String getPasswd() {
		return passwd;
	}
public void setName(String setName) {
		name = setName;
	}
	public String getName() {
		return name;
	}
public void setUserid() {
		
	}
	public int getAge() {
		return age;
	}
}

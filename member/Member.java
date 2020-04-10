package com.jse.member;

import lombok.Data;

@Data
public class Member {

	private String userId, userPwd,name,ssn;
	public Member(String name, String userId, String userPwd, String userssn) {
		this.name = name;
		this.userId = userId;
		this.userPwd = userPwd;
		this.ssn = userssn;
	}
	
}

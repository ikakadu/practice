package com.mybatis;

import java.io.Serializable;

public class UserDTO implements Serializable{

	
	private static final long serialVersionUID = -4817617297132263524L;
	
	private String userName;
	private int age;
	private String email;
	private String sendTime;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", age=" + age + ", email=" + email + ", sendTime=" + sendTime + "]";
	}
	
	
}

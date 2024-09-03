package com.evergent.corejava.oops;

public class UserLogin {
	public void loginData() {
		System.out.println("Login Info");
	}
	public void loginData(String uname,String pass){
		System.out.println("Uname "+uname);
		System.out.println("Pass "+pass);
	}
	public void loginData(String uname,String pass,String captcha){
		System.out.println("Uname "+uname);
		System.out.println("Pass "+pass);
		System.out.println("captcha "+captcha);
	}
	public void loginData(int mobile,String pass){
		System.out.println("Mobile: "+mobile);
		System.out.println("Pass: "+pass);
	}
	public void show() {
		System.out.println("show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLogin login=new UserLogin();
		login.loginData();
		login.loginData("Lahari","Lahari123");
		login.loginData("Vishista","Vish123","LADDU");
		login.loginData(123456789,"welcome");
		login.show();

	}

}

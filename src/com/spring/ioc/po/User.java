package com.spring.ioc.po;

public class User {
	public void add() {
		System.out.println("add");
	}
	public static void main(String[] args) {
		//原始的做法
		User user = new User();
		user.add();
	}
}

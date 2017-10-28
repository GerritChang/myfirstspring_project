package com.spring.ioc.service;

import com.spring.ioc.dao.UserDao;

public class UserService {
	//定义dao类型属性
	private UserDao userdao;
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	public void add() {
		System.out.println("service");
		// 在service里得到dao的对象，才能调用dao里的方法
//		UserDao userDao = new UserDao();
		userdao.add();
	}
}

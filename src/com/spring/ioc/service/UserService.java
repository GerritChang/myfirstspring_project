package com.spring.ioc.service;

import com.spring.ioc.dao.UserDao;

public class UserService {
	//����dao��������
	private UserDao userdao;
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	public void add() {
		System.out.println("service");
		// ��service��õ�dao�Ķ��󣬲��ܵ���dao��ķ���
//		UserDao userDao = new UserDao();
		userdao.add();
	}
}

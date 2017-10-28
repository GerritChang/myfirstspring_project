package com.spring.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Bean2;
import com.spring.bean.Bean3;
import com.spring.ioc.po.Person;
import com.spring.ioc.po.User;
import com.spring.ioc.service.UserService;
import com.spring.property.Book;
import com.spring.property.PropertyDemo1;

public class TestUser {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testUser() {
		// ����Spring�������ļ������ݴ�������
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// �õ����ô����Ķ���
		User user1 = (User) context.getBean("user");
		User user2 = (User) context.getBean("user");
		System.out.println(user1);
		System.out.println(user2);
	}

	// ʹ�þ�̬��������ʵ��
	@Test
	public void testBean2() {
		// ����Spring�������ļ������ݴ�������
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// �õ����ô����Ķ���
		Bean2 bean2 = (Bean2) context.getBean("bean2");
		System.out.println(bean2);
		bean2.add();
	}

	// ʹ��ʵ����������ʵ��
	@Test
	public void testBean3() {
		// ����Spring�������ļ������ݴ�������
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// �õ����ô����Ķ���
		Bean3 bean3 = (Bean3) context.getBean("bean3");
		System.out.println(bean3);
		bean3.add();
	}

	// ʹ���вι���ע��
	@Test
	public void testUser2() {
		// ����Spring�������ļ������ݴ�������
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// �õ����ô����Ķ���
		PropertyDemo1 demo1 = (PropertyDemo1) context.getBean("demo");
		demo1.test1();
	}

	// ʹ��setXXX()ע��
	@Test
	public void testUser3() {
		// ����Spring�������ļ������ݴ�������
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// �õ����ô����Ķ���
		Book book = (Book) context.getBean("book");
		book.demobook();
	}

	// ע��������͵�����
	@Test
	public void testUser4() {
		// ����Spring�������ļ������ݴ�������
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// �õ����ô����Ķ���
		UserService service = (UserService) context.getBean("userservice");
		service.add();
	}

	// ע��������͵�����
	@Test
	public void testUser5() {
		// ����Spring�������ļ������ݴ�������
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// �õ����ô����Ķ���
		Person person = (Person) context.getBean("person");
		person.test1();
	}

	// ע�븴�����͵�����
	@Test
	public void testUser6() {
		// ����Spring�������ļ������ݴ�������
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// �õ����ô����Ķ���
		Person person = (Person) context.getBean("person");
		person.test1();
	}
}

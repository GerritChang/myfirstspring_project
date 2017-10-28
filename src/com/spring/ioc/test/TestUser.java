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
		// 加载Spring的配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// 得到配置创建的对象
		User user1 = (User) context.getBean("user");
		User user2 = (User) context.getBean("user");
		System.out.println(user1);
		System.out.println(user2);
	}

	// 使用静态工厂创建实例
	@Test
	public void testBean2() {
		// 加载Spring的配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// 得到配置创建的对象
		Bean2 bean2 = (Bean2) context.getBean("bean2");
		System.out.println(bean2);
		bean2.add();
	}

	// 使用实例工厂创建实例
	@Test
	public void testBean3() {
		// 加载Spring的配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// 得到配置创建的对象
		Bean3 bean3 = (Bean3) context.getBean("bean3");
		System.out.println(bean3);
		bean3.add();
	}

	// 使用有参构造注入
	@Test
	public void testUser2() {
		// 加载Spring的配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// 得到配置创建的对象
		PropertyDemo1 demo1 = (PropertyDemo1) context.getBean("demo");
		demo1.test1();
	}

	// 使用setXXX()注入
	@Test
	public void testUser3() {
		// 加载Spring的配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// 得到配置创建的对象
		Book book = (Book) context.getBean("book");
		book.demobook();
	}

	// 注入对象类型的属性
	@Test
	public void testUser4() {
		// 加载Spring的配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// 得到配置创建的对象
		UserService service = (UserService) context.getBean("userservice");
		service.add();
	}

	// 注入对象类型的属性
	@Test
	public void testUser5() {
		// 加载Spring的配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// 得到配置创建的对象
		Person person = (Person) context.getBean("person");
		person.test1();
	}

	// 注入复杂类型的属性
	@Test
	public void testUser6() {
		// 加载Spring的配置文件，根据创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		// 得到配置创建的对象
		Person person = (Person) context.getBean("person");
		person.test1();
	}
}

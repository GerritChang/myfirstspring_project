package com.spring.ioc.po;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private String pname;

	public void setPname(String pname) {
		this.pname = pname;
	}

	private String[] array;
	private List<String> list;
	private Map<String, String> map;
	private Properties properties;

	public void setArray(String[] array) {
		this.array = array;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void test1() {
		System.out.println("array:"+array);
		System.out.println("list:"+list);
		System.out.println("map:"+map);
		System.out.println("properties:"+properties);
		System.out.println("person:" + pname);
	}
}

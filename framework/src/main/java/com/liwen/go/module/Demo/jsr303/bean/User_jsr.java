package com.liwen.go.module.Demo.jsr303.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class User_jsr implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message="{validate.notempty}")
	//@NotNull
	private String name;// 名字

	private Integer age;// 年龄

	private String hobby;// 爱好

	private Address_jsr address;// 地址

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Address_jsr getAddress() {
		return address;
	}

	public void setAddress(Address_jsr address) {
		this.address = address;
	}
}

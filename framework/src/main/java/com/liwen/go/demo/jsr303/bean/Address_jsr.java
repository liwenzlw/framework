package com.liwen.go.demo.jsr303.bean;

import java.io.Serializable;

public class Address_jsr implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer number;//门牌号
	
	private String street;//街道

	private String city;//城市

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}

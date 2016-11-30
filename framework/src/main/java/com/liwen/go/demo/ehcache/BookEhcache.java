package com.liwen.go.demo.ehcache;

import java.io.Serializable;

public class BookEhcache implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;

	public BookEhcache() {

	}

	public BookEhcache(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package com.liwen.go.module.right.realm;

import java.io.Serializable;

import org.apache.shiro.util.SimpleByteSource;

public class MySimpleByteSource extends SimpleByteSource implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private byte[] bytes;
	
	public MySimpleByteSource(byte[] bytes) {
		super(bytes);
	}

	public MySimpleByteSource() {
		super("");
	}
	public MySimpleByteSource(String string) {
		super(string);
	}
}

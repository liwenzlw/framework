package com.liwen.go.module.authz.realm;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Arrays;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.CodecSupport;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.util.ByteSource;

public class MySimpleByteSource implements ByteSource, Serializable {

	private static final long serialVersionUID = 1L;

	private byte[] bytes;
	private String cachedHex;
	private String cachedBase64;

	public MySimpleByteSource() {
		super();
	}
	
	public MySimpleByteSource(byte[] bytes) {
		this.bytes = bytes;
	}

	public MySimpleByteSource(char[] chars) {
		this.bytes = CodecSupport.toBytes(chars);
	}

	public MySimpleByteSource(String string) {
		this.bytes = CodecSupport.toBytes(string);
	}

	public MySimpleByteSource(ByteSource source) {
		this.bytes = source.getBytes();
	}

	public MySimpleByteSource(File file) {
		this.bytes = new BytesHelper().getBytes(file);
	}

	public MySimpleByteSource(InputStream stream) {
		this.bytes = new BytesHelper().getBytes(stream);
	}

	@Override
	public byte[] getBytes() {
		return bytes;
	}

	@Override
	public String toHex() {
		if (this.cachedHex == null) {
			this.cachedHex = Hex.encodeToString(getBytes());
		}
		return this.cachedHex;
	}

	@Override
	public String toBase64() {
		if (this.cachedBase64 == null) {
			this.cachedBase64 = Base64.encodeToString(getBytes());
		}
		return this.cachedBase64;
	}

	@Override
	public String toString() {
		return toBase64();
	}

	@Override
	public int hashCode() {
		if (this.bytes == null || this.bytes.length == 0) {
			return 0;
		}
		return Arrays.hashCode(this.bytes);
	}

	@Override
	public boolean isEmpty() {
		return this.bytes == null || this.bytes.length == 0;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o instanceof ByteSource) {
			ByteSource bs = (ByteSource) o;
			return Arrays.equals(getBytes(), bs.getBytes());
		}
		return false;
	}

	private static final class BytesHelper extends CodecSupport {
		public byte[] getBytes(File file) {
			return toBytes(file);
		}

		public byte[] getBytes(InputStream stream) {
			return toBytes(stream);
		}
	}
}

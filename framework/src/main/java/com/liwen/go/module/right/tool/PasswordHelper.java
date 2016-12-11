package com.liwen.go.module.right.tool;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import com.liwen.go.module.right.bean.User;

public class PasswordHelper {

	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
	private String algorithmName = "md5";
	private int hashIterations = 2;

	public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
		this.randomNumberGenerator = randomNumberGenerator;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public void setHashIterations(int hashIterations) {
		this.hashIterations = hashIterations;
	}

	public void encryptPassword(User user) {
		user.setUserSalt(randomNumberGenerator.nextBytes().toHex());
		String newPassword = new SimpleHash(algorithmName, 
				user.getUserPassword(),
				ByteSource.Util.bytes(user.getUserSalt()), 
				hashIterations).toHex();
		user.setUserPassword(newPassword);
	}
}
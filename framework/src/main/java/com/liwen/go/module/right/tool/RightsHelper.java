package com.liwen.go.module.right.tool;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.druid.util.StringUtils;

/**
 * 使用BigInteger维护权限
 * 
 * @author jimboi
 *
 */
public class RightsHelper {

	private static Logger logger = LoggerFactory.getLogger(RightsHelper.class);

	/**
	 * 测试是否有权限
	 * 
	 * @param sumRights
	 *            总权限
	 * @param targetRight
	 *            目标权限
	 * @return
	 */
	public static boolean testRight(BigInteger sumRights, Integer targetRight) {
		return sumRights.testBit(targetRight);
	}
	
	/**
	 * 测试是否有权限
	 * 
	 * @param sumRights
	 *            总权限
	 * @param targetRight
	 *            目标权限
	 * @return
	 */
	public static boolean testRight(BigInteger sumRights, String targetRight) {
		return sumRights.testBit(Integer.valueOf(targetRight));
	}

	/**
	 * 测试是否有权限
	 * 
	 * @param sumRights
	 *            总权限
	 * @param targetRight
	 *            目标权限
	 * @return
	 */
	public static boolean testRight(String sumRights, Integer targetRight) {
		if (StringUtils.isEmpty(sumRights)) {
			return false;
		}
		return testRight(new BigInteger(sumRights), targetRight);
	}
	/**
	 * 测试是否有权限
	 * 
	 * @param sumRights
	 *            总权限
	 * @param targetRight
	 *            目标权限
	 * @return
	 */
	public static boolean testRight(String sumRights, String targetRight) {
		if (StringUtils.isEmpty(sumRights)) {
			return false;
		}
		return testRight(new BigInteger(sumRights), targetRight);
	}

	/**
	 * 对BigInteger的bit位进行设置，统计总权限
	 * 
	 * @param rightArray
	 *            权限集合
	 * @return bit位设置后的总权限
	 */
	public static BigInteger sumRights(Integer... rightArray) {
		BigInteger rights = new BigInteger("0");
		for (Integer right : rightArray) {
			rights.setBit(right);
		}
		return rights;
	}
	/**
	 * 对BigInteger的bit位进行设置，统计总权限
	 * 
	 * @param rightArray
	 *            权限集合
	 * @return bit位设置后的总权限
	 */
	public static BigInteger sumRights(String... rightArray) {
		BigInteger rights = new BigInteger("0");
		for (String right : rightArray) {
			rights.setBit(Integer.valueOf(right));
		}
		return rights;
	}
}

package com.liwen.go.module.rights.bean;

/**
 * 系统用户
 * 
 * @author jimboi
 *
 */
public class User {
	private Integer userId;// 用户id

	private String userUsername;// 用户登录名

	private String userName;// 用户名字

	private String userPassword;// 密码

	private String userIdentifier;// 识别码

	private String userPhone;// 电话

	private String userEmail;// 邮箱

	private Byte userSkin;// 皮肤

	private String lastLogin;// 最后登录时间

	private String userIp;// ip地址

	private String userSalt;// 盐

	private Byte isLock;// 锁定标识符

	private String userQq;// QQ

	private Role role;// 角色对象

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserUsername() {
		return userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername == null ? null : userUsername.trim();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword == null ? null : userPassword.trim();
	}

	public String getUserIdentifier() {
		return userIdentifier;
	}

	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier == null ? null : userIdentifier.trim();
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone == null ? null : userPhone.trim();
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail == null ? null : userEmail.trim();
	}

	public Byte getUserSkin() {
		return userSkin;
	}

	public void setUserSkin(Byte userSkin) {
		this.userSkin = userSkin;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin == null ? null : lastLogin.trim();
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp == null ? null : userIp.trim();
	}

	public String getUserSalt() {
		return userSalt;
	}

	public void setUserSalt(String userSalt) {
		this.userSalt = userSalt == null ? null : userSalt.trim();
	}

	public Byte getIsLock() {
		return isLock;
	}

	public void setIsLock(Byte isLock) {
		this.isLock = isLock;
	}

	public String getUserQq() {
		return userQq;
	}

	public void setUserQq(String userQq) {
		this.userQq = userQq == null ? null : userQq.trim();
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
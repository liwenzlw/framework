package com.liwen.go.module.right.realm;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.liwen.go.module.right.bean.Role;
import com.liwen.go.module.right.bean.User;
import com.liwen.go.module.right.service.UserService;

public class MyBigIntegerRealm extends AuthorizingRealm {

	private UserService userService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		if (principals == null) {
          throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }
		User user = (User) getAvailablePrincipal(principals);
		SimpleAuthorizationInfo info = null;
		Role role = user.getRole();
		if(role == null) {
			return info;
		}
		info = new SimpleAuthorizationInfo();
		info.addRole(role.getRoleName());
		info.addObjectPermission(new BigIntegerPermission(role.getMenuRights(),role.getGridAddRights(),role.getGridDelRights(),role.getGridReadRights(),role.getGridUpdateRights(),role.getOnOffRights()));
        return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		String username = upToken.getUsername();

		// Null username is invalid
		if (username == null) {
			throw new AccountException("Null usernames are not allowed by this realm.");
		}
		User user = userService.selectByUserName(username);
		if(user == null) {
            throw new UnknownAccountException();//没找到帐号
        }

        if(1==user.getIsLock()) {
            throw new LockedAccountException(); //帐号锁定
        }
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, user.getUserPassword().toCharArray(), getName());
		info.setCredentialsSalt(new MySimpleByteSource(user.getUserSalt()));
		PrincipalCollection principals = new SimplePrincipalCollection(user, getName());
		info.setPrincipals(principals);
		return info;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}

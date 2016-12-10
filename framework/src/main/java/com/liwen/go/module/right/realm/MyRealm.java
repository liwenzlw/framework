package com.liwen.go.module.right.realm;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.config.ConfigurationException;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.JdbcUtils;

public class MyRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		String username = upToken.getUsername();

		// Null username is invalid
		if (username == null) {
			throw new AccountException("Null usernames are not allowed by this realm.");
		}

//		Connection conn = null;
//		SimpleAuthenticationInfo info = null;
//		try {
//			conn = dataSource.getConnection();
//
//			String password = null;
//			String salt = null;
//			switch (saltStyle) {
//			case NO_SALT:
//				password = getPasswordForUser(conn, username)[0];
//				break;
//			case CRYPT:
//				// TODO: separate password and hash from getPasswordForUser[0]
//				throw new ConfigurationException("Not implemented yet");
//				// break;
//			case COLUMN:
//				String[] queryResults = getPasswordForUser(conn, username);
//				password = queryResults[0];
//				salt = queryResults[1];
//				break;
//			case EXTERNAL:
//				password = getPasswordForUser(conn, username)[0];
//				salt = getSaltForUser(username);
//			}
//
//			if (password == null) {
//				throw new UnknownAccountException("No account found for user [" + username + "]");
//			}
//
//			info = new SimpleAuthenticationInfo(username, password.toCharArray(), getName());
//
//			if (salt != null) {
//				info.setCredentialsSalt(ByteSource.Util.bytes(salt));
//			}
//
//		} catch (SQLException e) {
//			final String message = "There was a SQL error while authenticating user [" + username + "]";
//			if (log.isErrorEnabled()) {
//				log.error(message, e);
//			}
//
//			// Rethrow any SQL errors as an authentication exception
//			throw new AuthenticationException(message, e);
//		} finally {
//			JdbcUtils.closeConnection(conn);
//		}

		return null;
	}

}

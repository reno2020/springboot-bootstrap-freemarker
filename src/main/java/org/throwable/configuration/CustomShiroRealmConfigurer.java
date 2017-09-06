package org.throwable.configuration;

import org.apache.shiro.authc.AccountException;
import org.springframework.stereotype.Component;
import org.throwable.shiro.common.LoginFailResult;
import org.throwable.shiro.common.LoginResult;
import org.throwable.shiro.common.LoginSuccessResult;
import org.throwable.shiro.support.AbstractShiroRealmConfigurer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/9/5 1:03
 */
@Component
public class CustomShiroRealmConfigurer extends AbstractShiroRealmConfigurer {

	@Override
	protected Set<String> addRoles(Object principal) {
		Set<String> roles = new HashSet<>();
		if (null != principal && "doge".equals(principal.toString())) {
			roles.add("admin");
		}
		return roles;
	}

	@Override
	protected List<LoginResult> processLogin(String principal, String credential) {
		List<LoginResult> results = new ArrayList<>();
		if ("doge".equals(principal) && "admin".equals(credential)) {
			results.add(new LoginSuccessResult());
		} else {
			results.add(new LoginFailResult<>(new AccountException("账号或密码错误")));
		}
		return results;
	}
}

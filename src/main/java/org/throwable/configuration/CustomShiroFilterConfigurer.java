package org.throwable.configuration;

import org.springframework.stereotype.Component;
import org.throwable.shiro.support.AbstractShiroFilterConfigurer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/9/5 1:13
 */
@Component
public class CustomShiroFilterConfigurer extends AbstractShiroFilterConfigurer {

	@Override
	protected Map<String, String> setFilterChainDefinitionMap() {
		Map<String, String> result = new HashMap<>();
		result.put("/bootstrap/**", "anon");
		result.put("/js/**", "anon");
		result.put("/403", "anon");
		result.put("/login", "anon");
		result.put("/index", "authc");
		return result;
	}
}

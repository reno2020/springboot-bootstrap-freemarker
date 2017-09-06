package org.throwable.web;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.throwable.shiro.common.annotation.ShiroLogin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/9/5 0:46
 */
@Controller
public class IndexController {

	@GetMapping(value = "/index")
	@RequiresRoles(value = {"admin"})
	public String index(Model model) {
		model.addAttribute("name", "doge");
		model.addAttribute("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		return "index";
	}

	@GetMapping(value = "/403")
	public String error() {
		return "403";
	}

	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}

	@PostMapping(value = "/login/submit")
	@ResponseBody
	@ShiroLogin
	public Map<String, Object> loginSubmit() {
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("message", "login success");
		return result;
	}
}

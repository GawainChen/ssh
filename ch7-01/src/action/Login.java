/**
 * 2016年7月12日下午11:23:11
 */
package action;

import java.util.Map;

import service.IUserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Gawain_Chen 该Action处理登录事宜
 */
public class Login extends ActionSupport {
	private IUserService userService;
	private String userName;
	private String password;

	/*
	 * 如果用户名和密码匹配则登录成功 并且将当前登录的用户的ID保存在session对象中
	 */
	public String execute() throws Exception {
		// 得到当前的session
		Map<String, Object> session = ActionContext.getContext().getSession();
		// 由用户名得到用户ID
		String userId = userService.getUserIdByName(userName);
		// 将ID保存在session中
		session.put("userId", userId);
		return SUCCESS;

	}

	/* 验证用户名和密码是否匹配 */
	public void validate() {
		if (!userService.validateUser(userName, password)) {
			addFieldError("password", "密码不正确");
		}
	}

	public void setUerService(IUserService userService) {
		this.userService = userService;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
}

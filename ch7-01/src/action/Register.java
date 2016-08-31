package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.User;
import service.IUserService;

public class Register extends ActionSupport {
	private IUserService userService;
	private String userName;
	private String gender;
	private Integer age;
	private String realName;
	private String password;
	private String personalSignature;

	/*
	 * 取得新注册的用户信息。如果验证通过，则注册成功 并添加到数据库 且将用户ID保存在session中，使用户处于登录成功状态
	 */
	public String execute() throws Exception {
		// 构建User
		User user = new User();
		user.setUserName(userName);
		user.setGender(gender);
		user.setAge(age);
		user.setRealName(realName);
		user.setPassword(password);
		user.setPersonalSignature(personalSignature);

		// 添加到数据库
		userService.addUser(user);
		// 保存ID到session中
		Map<String, String> session = ActionContext.getContext().getSession();
		session.put("userId", user.getId());
		return SUCCESS;

	}

	/*
	 * 验证用户名的唯一性
	 */
/*	public void validate() {
		if (userService.isUserExist(userName)) {
			addFieldError("userName", "用户已存在！");
		}
	}*/

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public void setPersonalSignature(String personalSignature) {
		this.personalSignature = personalSignature;
	}

}
package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.User;
import service.IUserService;

/*
 * 控制面板给用户提供了修改信息的机会，ControlPanel就是其具体实现
 */
public class ControlPanel extends ActionSupport {
	private IUserService userService;
	private String userName;
	private String gender;
	private Integer age;
	private String realName;
	private String password;
	private String personalSignature;

	/*
	 * execute（）函数在用户修改了信息并确认后获取并保存新的信息
	 */
	public String execute() throws Exception {

		// session中得到ID，再通过IUserService得到User
		Map<String, String> session = ActionContext.getContext().getSession();
		String userId = session.get("userId");
		User user = userService.getUserByID(userId);
		// 得到新的信息
		user.setUserName(getUserName());
		user.setGender(getGender());
		user.setAge(getAge());
		user.setRealName(getRealName());
		user.setPassword(getPassword());
		user.setPersonalSignature(getPersonalSignature());

		// 更新信息
		userService.updateUser(user);
		return SUCCESS;

	}

	/*
	 * input()函数将在execute（）函数之前执行，它事先得到用户原来的基本信息，使得用户在进入controlPanel.
	 * jsp页面时获得自己的信息
	 */
	public String input() throws Exception {
		// 从session中得到ID，再通过IUservice得到User
		Map<String, String> session = ActionContext.getContext().getSession();
		String userId = session.get("userId");
		User user = userService.getUserByID(userId);
		// 设置User的信息
		setUserName(user.getUserName());
		setGender(user.getGender());
		setAge(user.getAge());
		setRealName(user.getRealName());
		setPassword(user.getPassword());
		setPersonalSignature(user.getPersonalSignature());
		return INPUT;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPersonalSignature() {
		return personalSignature;
	}

	public void setPersonalSignature(String personalSignature) {
		this.personalSignature = personalSignature;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
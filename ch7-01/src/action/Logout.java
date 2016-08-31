package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport {
	/**
	 * 用户退出，清除session
	 */
	public String execute() throws Exception {
		ActionContext.getContext().getSession().clear();
		return SUCCESS;

	}
}

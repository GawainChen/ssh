package action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Information;
import domain.User;
import service.ICommentService;
import service.IInfoService;
import service.IUserService;

public class Main extends ActionSupport {
	private IUserService userService;
	private IInfoService infoService;
	private ICommentService commentService;
	private String userId;
	private String userName;
	private Map<String, List<Information>> informations = new HashMap<String, List<Information>>();

	public String execute() throws Exception {
		Map<String, String> session = ActionContext.getContext().getSession();
		String userId = session.get("userId");
		if (userId != null) {
			this.userId = userId;
			User user = userService.getUserByID(userId);
			userName = user.getUserName();
		}
		List<String> types = infoService.getAllTypes();
		for (int i = 0; i < types.size(); i++) {
			String type = types.get(i);
			//informations.put(type, infoService.getInfoByType(type));
		}

		return SUCCESS;

	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public IInfoService getInfoService() {
		return infoService;
	}

	public void setInfoService(IInfoService infoService) {
		this.infoService = infoService;
	}

	public ICommentService getCommentService() {
		return commentService;
	}

	public void setCommentService(ICommentService commentService) {
		this.commentService = commentService;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public Map<String, List<Information>> getInformations() {
		return informations;
	}

}

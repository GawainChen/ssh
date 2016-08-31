package action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Comment;
import domain.Information;
import domain.User;
import service.ICommentService;
import service.IInfoService;
import service.IUserService;

public class InformationAction extends ActionSupport {
	private IInfoService infoService;
	private IUserService userService;
	private ICommentService commentService;
	private String infoId;
	private String userName;
	private String title;
	private String type;
	private String userId;
	private String content;
	private Information information;
	private List<Information> informations;
	private String listType;
	private List<Comment> comments;

	public String execute() throws Exception {
		return SUCCESS;

	}

	public String add() throws Exception {
		Map<String, String> session = ActionContext.getContext().getSession();
		String userId = session.get("userId");
		User user = userService.getUserByID(userId);
		userName = user.getUserName();
		Information information = new Information();
		information.setTitle(getTitle());
		information.setContent(getContent());
		information.setType(getType());
		information.setPublishingTime(new Date());
		information.setPublishingUser(user);
		infoService.addInfo(information);
		return "main";
	}

	public String delete() throws Exception {
		infoService.deleteInfoById(infoId);
		return execute();
	}

	public String edit() throws Exception {
		Information information = infoService.getInfoByID(infoId);
		information.setTitle(title);
		information.setContent(content);
		information.setType(type);
		infoService.updateInfo(information);
		return execute();
	}

	public String detail() throws Exception {
		information = infoService.getInfoByID(infoId);
		comments = commentService.getCommentByInfoId(infoId);
		userId = (String) ActionContext.getContext().getSession().get("userId");
		return "detail";
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String list() throws Exception {
		listType = new String(listType.getBytes("ISO-8859-1"), "GBK");
		informations = infoService.getInfoByType(getListType());
		userId = (String) ActionContext.getContext().getSession().get("userId");
		userName = userService.getUserByID(userId).getUserName();
		return "list";
	}

	public String input() throws Exception {
		Map<String, String> session = ActionContext.getContext().getSession();
		String userId = session.get("userId");
		User user = userService.getUserByID(userId);
		userName = user.getUserName();
		return INPUT;
	}

	public String editInput() throws Exception {
		Map<String, String> session = ActionContext.getContext().getSession();
		String userId = session.get("userId");
		User user = userService.getUserByID(userId);
		userName = user.getUserName();
		Information information = infoService.getInfoByID(infoId);
		title = information.getTitle();
		content = information.getContent();
		type = information.getType();
		return "edit";
	}

	public IInfoService getInfoService() {
		return infoService;
	}

	public void setInfoService(IInfoService infoService) {
		this.infoService = infoService;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public ICommentService getCommentService() {
		return commentService;
	}

	public void setCommentService(ICommentService commentService) {
		this.commentService = commentService;
	}

	public String getInfoId() {
		return infoId;
	}

	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	public List<Information> getInformations() {
		return informations;
	}

	public void setInformations(List<Information> informations) {
		this.informations = informations;
	}

	public String getListType() {
		return listType;
	}

	public void setListType(String listType) {
		this.listType = listType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}

package action;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Comment;
import domain.Information;
import domain.User;
import service.ICommentService;
import service.IInfoService;
import service.IUserService;

public class CommentAction extends ActionSupport {
	private ICommentService commentService;
	private IInfoService infoService;
	private IUserService userService;
	private String infoId;
	private String title;
	private String content;
	private String commentId;

	/*
	 * 函数add先从session中得到正在操作的用户，然后得到评论的标题内容等
	 * 最后通过ICommentService(虽然是一个借口，但注入的是实现了该接口的类)添加评论
	 */
	public String add() throws Exception {
		Map<String, String> session = ActionContext.getContext().getSession();
		String userId = session.get("userId");
		User user = userService.getUserByID(userId);
		Information information = infoService.getInfoByID(userId);
		Comment comment = new Comment();
		comment.setTitle(title);
		comment.setContent(content);
		comment.setCommenter(user);
		comment.setInformation(information);
		comment.setDeliveredTime(new Date());
		commentService.addComment(comment);
		return SUCCESS;
	}

	public String delete() throws Exception {
		commentService.deleteCommentId(commentId);
		return SUCCESS;
	}

	public ICommentService getCommentService() {
		return commentService;
	}

	public void setCommentService(ICommentService commentService) {
		this.commentService = commentService;
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

	public String getInfoId() {
		return infoId;
	}

	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

}

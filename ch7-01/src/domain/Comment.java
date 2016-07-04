package domain;

import java.util.Date;

/*
 * 评论类
 * */
public class Comment {
	// 评论ID
	private String id;
	// 标题
	private String title;
	// 评论内容
	private String content;
	// 评论时间
	private Date deliveredTime;
	// 评论者
	private User commenter;
	// 所评论的信息
	private Information information;

	public Comment() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getDeliveredTime() {
		return deliveredTime;
	}

	public void setDeliveredTime(Date deliveredTime) {
		this.deliveredTime = deliveredTime;
	}

	public User getCommenter() {
		return commenter;
	}

	public void setCommenter(User commenter) {
		this.commenter = commenter;
	}

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

}

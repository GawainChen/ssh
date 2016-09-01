package service;

import java.util.List;

import domain.Comment;

public interface ICommentService {
	public void addComment(Comment comment);

	public void deleteComment(Comment comment);

	public void updateComment(Comment comment);

	public Comment getCommentByID(String id);

	public List<Comment> getAllComment();

	public List<Comment> getCommentByInfoId(String infoId);

	public void deleteCommentId(String commentId);
}

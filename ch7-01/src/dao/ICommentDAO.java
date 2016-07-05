package dao;

import java.util.List;

import domain.Comment;

/*
 * Comment类对应的DAO接口，提供一些与信息相关的数据库CRUD操作的公开的方法声明
 */
public interface ICommentDAO {
	public void addComment(Comment comment);

	public Comment getCommentById(String id);

	public void updateComment(Comment comment);

	public void deleteComment(Comment comment);

	public List<Comment> getCommnetByTitle(String title);

	public List<Comment> getAllComments();
}

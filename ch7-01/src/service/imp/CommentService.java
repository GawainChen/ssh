package service.imp;

import java.util.List;

import dao.ICommentDAO;
import domain.Comment;
import service.ICommentService;

public class CommentService implements ICommentService {
	/*
	 * 定义ICommentDAO类型的属性，以实现CommentService和ICommentDAO实现类之间的协作
	 */
	private ICommentDAO commentDAO;

	public CommentService() {

	}

	public void setCommentDAO(ICommentDAO commentDAO) {
		this.commentDAO = commentDAO;
	}

	@Override
	public void addComment(Comment comment) {
		if (comment == null)
			return;
		if (comment.getId() != null)
			return;
		commentDAO.addComment(comment);

	}

	@Override
	public void deleteComment(Comment comment) {
		if (comment == null)
			return;
		if (comment.getId() == null)
			return;
		commentDAO.deleteComment(comment);

	}

	@Override
	public void updateComment(Comment comment) {
		if (comment == null)
			return;
		if (comment.getId() == null)
			return;
		commentDAO.updateComment(comment);

	}

	@Override
	public Comment getCommentByID(String id) {
		if (id == null)
			return null;
		return commentDAO.getCommentById(id);
	}

	@Override
	public List<Comment> getAllComment() {
		return commentDAO.getAllComments();
	}

}

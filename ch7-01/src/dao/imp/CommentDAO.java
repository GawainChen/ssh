package dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ICommentDAO;
import domain.Comment;

public class CommentDAO extends HibernateDaoSupport implements ICommentDAO {
	public CommentDAO() {

	}

	@Override
	public void addComment(Comment comment) {
		this.getHibernateTemplate().save(comment);

	}

	@Override
	public Comment getCommentById(String id) {

		return (Comment) this.getHibernateTemplate().get(Comment.class, id);
	}

	@Override
	public void updateComment(Comment comment) {
		this.getHibernateTemplate().update(comment);

	}

	@Override
	public void deleteComment(Comment comment) {
		this.getHibernateTemplate().delete(comment);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> getCommnetByTitle(String title) {
		String hsql = "from Comment where title = '" + title + "'";
		return this.getHibernateTemplate().find(hsql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> getAllComments() {
		String hsql = "from Comment";
		return this.getHibernateTemplate().find(hsql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> getCommnetByInfoId(String infoId) {
		String hsql = "from Comment where id = '" + infoId + "'";
		return this.getHibernateTemplate().find(hsql);
	}

}

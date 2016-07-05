package dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.IUserDAO;
import domain.User;

/*
 * User类对应的DAO
 采用Hibernate实现IUsrDAO
 提供数据库CRUD操作
 */
public class UserDAO extends HibernateDaoSupport implements IUserDAO {
	/*
	 * 默认构造函数，在使用Spring和Hibernate的环境中一般需要（反射）
	 */

	public UserDAO() {

	}

	@Override
	public void addUser(User user) {
		this.getHibernateTemplate().save(user);

	}

	@Override
	public User getUserByID(String id) {

		return (User) this.getHibernateTemplate().get(User.class, id);
	}

	@Override
	public void deleteUser(User user) {
		this.getHibernateTemplate().delete(user);

	}

	@Override
	public void updateUser(User user) {
		this.getHibernateTemplate().update(user);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserByUserName(String userName) {
		String hsql = "from User where userName = '" + userName + "'";
		return this.getHibernateTemplate().find(hsql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
		String hsql = "from User";
		return (List<User>) this.getHibernateTemplate().find(hsql);
	}

}

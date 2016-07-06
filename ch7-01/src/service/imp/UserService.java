package service.imp;

import java.util.List;

import dao.IUserDAO;
import domain.User;
import service.IUserService;

/*
 * 用户服务类，用来处理业务逻辑类
 * */
public class UserService implements IUserService {
	/*
	 * 定义IUserDAO类型的属性，以实现UserService和IUserDAO实现类之间的协作
	 */

	private IUserDAO userDAO;

	public UserService() {

	}

	/*
	 * 带参数的构造函数，在使用Spring的构造器注入的时候需要（反射）
	 */
	public UserService(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/*
	 * 设置userDAO属性，在使用Spring的Setter注入时需要
	 */
	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/*
	 * 往数据库中添加用户如果用户名不存在，则添加，否则不添加
	 */
	@Override
	public void addUser(User user) {
		if (user == null)
			return;
		if (user.getId() != null)
			return;
		String userName = user.getUserName();
		List<User> users = userDAO.getUserByUserName(userName);
		if (users.size() <= 0) {
			userDAO.addUser(user);
		} else {
			throw new RuntimeException("该用户已存在，请更换用户名");
		}

	}

	@Override
	public void deleteUser(User user) {
		if (user == null)
			return;
		if (user.getId() == null)
			return;
		userDAO.deleteUser(user);

	}

	@Override
	public void updateUser(User user) {
		if (user == null)
			return;
		if (user.getId() == null)
			return;
		userDAO.updateUser(user);

	}

	@Override
	public User getUserByID(String id) {
		if (id == null)
			return null;
		return userDAO.getUserByID(id);
	}

	@Override
	public List<User> getAllUser() {
		return userDAO.getAllUser();
	}

	@Override
	public boolean validateUser(String userName, String password) {
		List<User> users = userDAO.getUserByUserName(userName);
		if (users != null && users.size() != 0) {
			if (users.get(0).getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getUserIdByName(String userName) {
		List<User> users = userDAO.getUserByUserName(userName);
		return users.get(0).getId();
	}

}

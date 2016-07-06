package service;

import java.util.List;

import domain.User;

/*
 * User对应的业务逻辑接口，提供一些与信息相关的业务逻辑操作的公开的方法声明
 * */
public interface IUserService {
	public void addUser(User user);

	public void deleteUser(User user);

	public void updateUser(User user);

	public User getUserByID(String id);

	public List<User> getAllUser();

	public boolean validateUser(String userName, String password);

	public String getUserIdByName(String userName);
}

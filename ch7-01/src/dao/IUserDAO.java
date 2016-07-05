package dao;

import java.util.List;

import domain.User;

/*
 * User类对应的DAO接口，提供一些与用户相关的数据库CRUD操作的公开的方法声明
 * */
public interface IUserDAO {
	public void addUser(User user);

	public User getUserByID(String id);

	public void deleteUser(User user);

	public void updateUser(User user);

	public List<User> getUserByUserName(String userName);

	public List<User> getAllUser();
}

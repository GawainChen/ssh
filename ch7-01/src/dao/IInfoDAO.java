package dao;

import java.util.List;

import domain.Information;

/*
 * Infromation类对应的DAO接口，提供一些与信息相关的数据库CRUD操作的公开的方法声明
 */
public interface IInfoDAO {

	public void addInfo(Information information);

	public Information getInfoByID(String id);

	public void deleteInfo(Information information);

	public void updateInfo(Information information);

	public List<Information> getInfoByInfoTitle(String title);

	public List<Information> getAllInfo();
}

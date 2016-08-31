package dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.IInfoDAO;
import domain.Information;

public class InfoDAO extends HibernateDaoSupport implements IInfoDAO {
	public InfoDAO() {

	}

	@Override
	public void addInfo(Information information) {
		this.getHibernateTemplate().save(information);

	}

	@Override
	public Information getInfoByID(String id) {

		return (Information) this.getHibernateTemplate().get(Information.class, id);
	}

	@Override
	public void deleteInfo(Information information) {
		this.getHibernateTemplate().delete(information);

	}

	@Override
	public void updateInfo(Information information) {
		this.getHibernateTemplate().update(information);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Information> getInfoByInfoTitle(String title) {
		String hsql = "from Information where title = '" + title + "'";
		return this.getHibernateTemplate().find(hsql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Information> getAllInfo() {
		String hsql = "from Information";
		return this.getHibernateTemplate().find(hsql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getAllType() {
		String hsql = "select type from Information";
		return this.getHibernateTemplate().find(hsql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Information> getInfoByInfoType(String type) {
		String hsql = "from Information where type = '" + type + "'";
		return this.getHibernateTemplate().find(hsql);
	}

}

package service.imp;

import java.util.List;

import dao.IInfoDAO;
import domain.Information;
import service.IInfoService;

public class InfoService implements IInfoService {
	/*
	 * 定义IInfoDAO类型的属性，以实现InfoService和IInfoDAO实现类之间的协作
	 */
	private IInfoDAO infoDAO;

	public InfoService() {

	}

	public InfoService(IInfoDAO infoDAO) {
		this.infoDAO = infoDAO;
	}

	public void setInfoDAO(IInfoDAO infoDAO) {
		this.infoDAO = infoDAO;
	}

	@Override
	public void addInfo(Information information) {
		if (information == null)
			return;
		if (information.getId() != null)
			return;
		infoDAO.addInfo(information);

	}

	@Override
	public void deleteInfo(Information information) {
		if (information == null)
			return;
		if (information.getId() == null)
			return;
		infoDAO.deleteInfo(information);

	}

	@Override
	public void updateInfo(Information information) {
		if (information == null)
			return;
		if (information == null)
			return;
		infoDAO.updateInfo(information);

	}

	@Override
	public Information getInfoByID(String id) {
		if (id == null)
			return null;
		return infoDAO.getInfoByID(id);
	}

	@Override
	public List<Information> getAllInfo() {
		return infoDAO.getAllInfo();
	}

}

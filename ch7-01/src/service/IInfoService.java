package service;

import java.util.List;

import domain.Information;

public interface IInfoService {
	public void addInfo(Information information);

	public void deleteInfo(Information information);

	public void updateInfo(Information information);

	public Information getInfoByID(String id);

	public List<Information> getAllInfo();

	public List<String> getAllTypes();

	public List<Information> getInfoByType(String type);

	public void deleteInfoById(String infoId);
}

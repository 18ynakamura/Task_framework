package jp.co.axiz.web.service;

import java.util.List;

import jp.co.axiz.web.entity.UserInfo;

public interface IUserInfoService {

	public List<UserInfo> find(UserInfo userInfo);
	public UserInfo findById(Integer id);
	public int insert(UserInfo userInfo);
	public void delete(Integer id);
	public void update(UserInfo userInfo);
}

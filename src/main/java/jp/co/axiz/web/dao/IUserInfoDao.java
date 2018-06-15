package jp.co.axiz.web.dao;

import java.util.List;

import jp.co.axiz.web.entity.UserInfo;

public interface IUserInfoDao {

	public List<UserInfo> findAll();
	public List<UserInfo> findByConditions(UserInfo userInfo);
	public int register(UserInfo user);
	public UserInfo findById(Integer id);
	public void delete(Integer id);
	public void update(UserInfo user);
}

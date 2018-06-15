package jp.co.axiz.web.dao;

import jp.co.axiz.web.entity.Admin;

public interface IAdminDao {

	public Admin findByIdAndPassword(String id, String password);
}

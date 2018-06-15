package jp.co.axiz.web.entity;

import java.io.Serializable;

public class Admin implements Serializable {

	private String adminId;
	private String adminName;
	private String password;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String _adminId) {
		this.adminId = _adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String _adminName) {
		this.adminName = _adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

package jp.co.axiz.web.form;

import javax.validation.constraints.NotNull;

/*
 * 更新画面用フォーム
 */
public class UpdateForm {

	@NotNull
	private Integer userId;

	private String newName;

	private String newTel;

	private String newPassword;

	private String confirmNewPassword;

	private String prevName;

	private String prevTel;

	private String prevPassword;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer _userId) {
		this.userId = _userId;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String _newName) {
		this.newName = _newName;
	}

	public String getNewTel() {
		return newTel;
	}

	public void setNewTel(String _newTel) {
		this.newTel = _newTel;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

	public void setConfirmNewPassword(String _confirmNewPassword) {
		this.confirmNewPassword = _confirmNewPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String _newPassword) {
		this.newPassword = _newPassword;
	}

	public String getPrevName() {
		return prevName;
	}

	public void setPrevName(String _prevName) {
		this.prevName = _prevName;
	}

	public String getPrevTel() {
		return prevTel;
	}

	public void setPrevTel(String _prevTel) {
		this.prevTel = _prevTel;
	}

	public String getPrevPassword() {
		return prevPassword;
	}

	public void setPrevPassword(String _prevPassword) {
		this.prevPassword = _prevPassword;
	}

	public boolean hasRequiredError() {
		return (newName == null || newName.isEmpty())
				|| (newTel == null || newTel.isEmpty())
				|| (newPassword == null || newPassword.isEmpty());
	}
}

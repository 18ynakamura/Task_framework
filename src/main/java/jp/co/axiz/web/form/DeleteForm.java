package jp.co.axiz.web.form;

import javax.validation.constraints.NotNull;

/*
 * 削除画面用フォーム
 */
public class DeleteForm {

	@NotNull
	private Integer userId;

	private String name;

	private String tel;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer _userId) {
		this.userId = _userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String _tel) {
		this.tel = _tel;
	}
}

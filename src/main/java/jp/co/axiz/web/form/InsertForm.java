package jp.co.axiz.web.form;

import javax.validation.constraints.NotBlank;

/*
 * 登録画面用フォーム
 */
public class InsertForm {

	private Integer userId;

	@NotBlank
	private String name;

	@NotBlank
	private String tel;

	@NotBlank
	private String password;

	private String confirmPassword;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String _password) {
		this.password = _password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String _confirmPassword) {
		this.confirmPassword = _confirmPassword;
	}

	public boolean isEmpty() {
		return (name == null || name.isEmpty())
				&& (tel == null || tel.isEmpty())
				&& (password == null || password.isEmpty());
	}
}

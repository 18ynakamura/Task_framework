package jp.co.axiz.web.entity;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value= "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionInfo implements Serializable {
	private static final long serialVersionUID = 6334063099671792256L;

    private Admin loginUser;

	private UserInfo newUser;

	private UserInfo prevUser;

	private UserInfo afterUser;

    public Admin getLoginUser() {
           return loginUser;
    }

    public void setLoginUser(Admin _loginUser) {
           loginUser = _loginUser;
    }

	public UserInfo getNewUser() {
		return newUser;
	}

	public void setNewUser(UserInfo user) {
		newUser = user;
	}

	public UserInfo getPrevUser() {
		return prevUser;
	}

	public void setPrevUser(UserInfo _prevUser) {
		prevUser = _prevUser;
	}

	public UserInfo getAfterUser() {
		return afterUser;
	}

	public void setAfterUser(UserInfo _afterUser) {
		afterUser = _afterUser;
	}

	public void invalidate() {
		loginUser = null;
		newUser = null;
		prevUser = null;
		afterUser = null;
	}
}

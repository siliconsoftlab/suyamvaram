package com.slilicon.suyamvarm.domain;

public class UserAuthentication {
	private User user;
	private String authStatus;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAuthStatus() {
		return authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}
	public UserAuthentication() {
		super();
	}
	@Override
	public String toString() {
		return "UserAuthentication [user=" + user + ", authStatus=" + authStatus + "]";
	}
	
}

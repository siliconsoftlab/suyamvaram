package com.slilicon.suyamvarm.domain;

public class RequestWrapper {
	private User user;
	private Request request;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	@Override
	public String toString() {
		return "RequestWrapper [user=" + user + ", request=" + request + "]";
	}

	public RequestWrapper(User user, Request request) {
		super();
		this.user = user;
		this.request = request;
	}

	public RequestWrapper() {
		super();
	}

}

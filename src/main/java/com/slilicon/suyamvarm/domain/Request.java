package com.slilicon.suyamvarm.domain;

public class Request {
	
	private String id;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Request() {
		super();
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", status=" + status + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Request(String id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

}

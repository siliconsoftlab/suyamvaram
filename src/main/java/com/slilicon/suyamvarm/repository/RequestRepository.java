package com.slilicon.suyamvarm.repository;

import com.slilicon.suyamvarm.domain.Request;
import com.slilicon.suyamvarm.domain.User;

public interface RequestRepository {
	public String newRequest(User user,Request request);
	public String updateRequest(User user,Request request);
}

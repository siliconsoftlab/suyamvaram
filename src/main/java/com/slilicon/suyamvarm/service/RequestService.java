package com.slilicon.suyamvarm.service;

import com.slilicon.suyamvarm.domain.Request;
import com.slilicon.suyamvarm.domain.User;

public interface RequestService {
public String newRequest(User user,Request request);
public String updateRequest(User user,Request request);
}

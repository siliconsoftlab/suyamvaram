package com.slilicon.suyamvarm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slilicon.suyamvarm.domain.Request;
import com.slilicon.suyamvarm.domain.User;
import com.slilicon.suyamvarm.repository.RequestRepository;
import com.slilicon.suyamvarm.service.RequestService;
@Service
public class RequestServiceImpl implements RequestService{

	@Autowired
	RequestRepository requestRepository;
	@Override
	public String newRequest(User user, Request request) {
		String res=requestRepository.newRequest(user, request);
		return res;
	}
	@Override
	public String updateRequest(User user, Request request) {
		String res=requestRepository.updateRequest(user, request);
		return res;
	}

}

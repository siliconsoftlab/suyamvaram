package com.slilicon.suyamvarm.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slilicon.suyamvarm.domain.User;
import com.slilicon.suyamvarm.repository.UserRepository;
import com.slilicon.suyamvarm.service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepository  userRepository;
private static final Logger logger=LoggerFactory.getLogger(UserServiceImpl.class);
	@Override
	public User login(User user) {
		logger.info("login");
		user=userRepository.login(user);
		return user;
		
	}
	@Override
	public User register(User user) {
		logger.info("register");
		user=userRepository.register(user);
		return user;
	}
	@Override
	public User logout(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String unregister(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.slilicon.suyamvarm.repository;

import com.slilicon.suyamvarm.domain.User;

public interface UserRepository {
	
	public User login(User user);
	public User logout(User user);
	public User register(User user);
	public String unregister(User user);
}

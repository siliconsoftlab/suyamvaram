package com.slilicon.suyamvarm;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.slilicon.suyamvarm.domain.User;

public interface UserCollection extends MongoRepository<User, String>{

	public User findByUsername(String username);
	public User findByUsername(String username,String password);
	
	// public boolean exists(String Username, String password);
}


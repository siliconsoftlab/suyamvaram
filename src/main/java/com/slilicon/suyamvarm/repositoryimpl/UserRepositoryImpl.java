package com.slilicon.suyamvarm.repositoryimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.slilicon.suyamvarm.UserCollection;
import com.slilicon.suyamvarm.domain.User;
import com.slilicon.suyamvarm.repository.UserRepository;
@Repository
public class UserRepositoryImpl implements UserRepository{
	//private Enum status{}
	 @Autowired
	 UserCollection userCollection;
	
	private static final Logger logger=LoggerFactory.getLogger(UserRepositoryImpl.class);
	@Override
	public User login(User user) {
		
		user=userCollection.findByUsername(user.getUsername(), user.getPassword());
		//System.out.println("The login user is "+ user);
		return user;
		
	}
	@Override
	public User register(User user) {
		return user=userCollection.save(user);
	}
	@Override
	public User logout(User user) {
		return null;
	}
	@Override
	public String unregister(User user) {
		boolean isUserExists=userCollection.existsById(user.getId());
		if(isUserExists)
		{
			userCollection.delete(user);
			return "Success";
		}else {
			return "User does not exists";
		}
		
		
	}
	

}

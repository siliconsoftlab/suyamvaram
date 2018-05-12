package com.slilicon.suyamvarm.service;

import com.slilicon.suyamvarm.domain.User;

public interface UserService {
public User login(User user);
public User logout(User user);
public User register(User user);
public String unregister(User user);
}

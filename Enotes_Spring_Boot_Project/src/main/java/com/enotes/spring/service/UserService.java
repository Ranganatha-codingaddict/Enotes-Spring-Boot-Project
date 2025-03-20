package com.enotes.spring.service;

import com.enotes.spring.entity.User;

public interface UserService {

	public User saveUser(User user);
	public boolean existEmailCheck(String email);
	
}

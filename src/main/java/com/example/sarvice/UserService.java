package com.example.sarvice;

import java.util.List;

import com.example.entity.User;



public interface UserService {
	
	User saveUser(User user);
	
	List <User>getUser();
	
	void deleteUser(Long id);
	
	User getUser(Long id);

}

package com.example.sarvice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepojitory;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepojitory userRepository;

	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getUser() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		User user = new User();
		user.setId(id);
		userRepository.delete(user);
		
	}
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(new User());
	}
	
	
	
	

}

package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.User;
import com.example.sarvice.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("list")
	
    public String getUser(Model model) {
		List<User> users = userService.getUser();
		model.addAttribute("userList", users);
    	return "index";
    }
	
	@GetMapping("user-form")
	public String addUserPage(Model model) {
		model.addAttribute("user", new User());
		return "user/add_user";
	}
	
	@PostMapping("save")
	public String addUser(@ModelAttribute User user) {
		userService.saveUser(user);
		return "redirect:list";
	}
	
	@GetMapping("delete/{userId}")
	public String getUsers(@PathVariable("userId") Long id) {
		userService.deleteUser(id);
		return "redirect:/user/list";
		
	}
	
	@GetMapping("edit/{userId}")
	public String editUser(@PathVariable("userId") Long id, Model model) {
		User user = userService.getUser(id);
		model.addAttribute("user", user);
		return "user/add_user";
		
	}


}

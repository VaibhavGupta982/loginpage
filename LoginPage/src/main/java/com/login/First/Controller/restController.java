package com.login.First.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.login.First.Model.User;
import com.login.First.services.UserService;

@RestController
public class restController {
	
	@Autowired
	private UserService userservice; 
	@GetMapping("/")
	public String hello()
	{
		return "vaibhav don't worry";
	}
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String username,@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age,@RequestParam String password)
	{
		User  user=new User(username,firstname,lastname,age,password);
		userservice.saveMyUser(user);
		return "User Saved";
	}

}

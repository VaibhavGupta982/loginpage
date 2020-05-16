package com.login.First.services;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.login.First.Model.User;
import com.login.First.repository.UserRepository;


@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	public UserService(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}
	
	public void saveMyUser(User user)
	{
		userRepository.save(user);
	}
	public  List<User> showAllUsers()
	{
		List<User> users=new ArrayList<User>();
		for(User user:userRepository.findAll())
		{
			users.add(user);
		}
		return  users;
	}
    public void deleteMyUser(int id)
	{
	    userRepository.deleteById(id);
	}
    
    public User editUser(int id) {
		return userRepository.findById(id).get();
	}
    public User findByUsernameAndPassword(String username, String password)
    {
     return userRepository.findByUsernameAndPassword(username, password);
    }

   
}

package com.example.MysqlSwagger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MysqlSwagger.models.User;
import com.example.MysqlSwagger.repositories.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo ur;
	
	public List<User> getalluser(){		
		return (List<User>) ur.findAll();
	}
	
	public Optional<User> getUser(int id) {
		return ur.findById(id);
	}

	public void createuser(User user) {		
		ur.save(user);
	}

	public User updateuser(User user, int id) {
		return ur.save(user);
	}

	public void deleteuser(int id) {
		ur.deleteById(id);		
	}

	
}

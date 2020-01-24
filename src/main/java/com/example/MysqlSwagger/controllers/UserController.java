package com.example.MysqlSwagger.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MysqlSwagger.models.User;
import com.example.MysqlSwagger.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping(value="/getalluser")
	
	public List<User> getalluser(){
		return us.getalluser();
		
	}
	
	@RequestMapping(value="/getuser/{id}")
	public Optional<User> getuser(@PathVariable int id) {
		return us.getUser(id);
		
	}
	
	@PostMapping(value="/createuser")
	public void createuser(@RequestBody User user) {

		us.createuser(user);
	}
	
	@PutMapping(value="/updateUser/{id}")
	
	public User updateuser(@RequestBody User user, @PathVariable int id) {
		return us.updateuser(user,id);

	}
	
	@DeleteMapping(value="/deleteuser/{id}")
	public void deleteuser(@PathVariable int id) {
		us.deleteuser(id);
	}
}

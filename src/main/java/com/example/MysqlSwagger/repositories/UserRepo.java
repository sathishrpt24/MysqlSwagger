package com.example.MysqlSwagger.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.MysqlSwagger.models.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}

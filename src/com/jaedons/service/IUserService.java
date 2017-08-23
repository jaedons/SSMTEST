package com.jaedons.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaedons.entity.UserEntity;

public interface IUserService {
	List<UserEntity > getAllUser();
	List<UserEntity> getUsersByUsername(String username);
	UserEntity getUserById(int id);
	UserEntity getUserByUsernameAndPassword(UserEntity userEntity);
	void insertUser(UserEntity user);
	void updateUser(UserEntity user);
	void deleteUser(int id);
}

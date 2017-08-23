package com.jaedons.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jaedons.entity.UserEntity;
import com.jaedons.persistence.UserMapper;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Resource 
	UserMapper userMapper;
	public List<UserEntity> getUsersByUsername(String username) {
		List<UserEntity> users = userMapper.getUsersByUsername(username);
		return users;
	}

	public UserEntity getUserByUsernameAndPassword(UserEntity userEntity) {
		UserEntity user = userMapper.getUserByUsernameAndPassword(userEntity);
		return user;
	}

	public void insertUser(UserEntity user) {
		userMapper.insertUser(user);
	}

	public void updateUser(UserEntity user) {
		userMapper.updateUser(user);
	}

	public List<UserEntity> getAllUser() {
		List<UserEntity> users = userMapper.getAllUser();
		return users;
	}

	public void deleteUser(int id) {
		userMapper.deleteUser(id);
	}

	public UserEntity getUserById(int id) {
		UserEntity user = userMapper.getUserById(id);
		return user;
	}

}

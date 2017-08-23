package com.jaedons.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jaedons.entity.UserEntity;

@Repository
public interface UserMapper {
	List<UserEntity> getAllUser();
	List<UserEntity> getUsersByUsername(String username);
	UserEntity getUserById(int id);
	UserEntity getUserByUsernameAndPassword(UserEntity userEntity);
	void insertUser(UserEntity user);
	void updateUser(UserEntity user);
	void deleteUser(int id);
}

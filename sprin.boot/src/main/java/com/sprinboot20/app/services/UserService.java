package com.sprinboot20.app.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sprinboot20.app.entities.User;
import com.sprinboot20.app.json.UserRest;

public interface UserService {

	public UserRest findUserByName(String name) throws Exception;
	
	public UserRest findUserById(Long Id) throws Exception;
	
	public List<UserRest> findAllUser() throws Exception;
	
	public Boolean deleteUserById(String name);
	
	public UserRest updateUserById(String name);
	
	public Iterable<User> findAll();
	
	public Page<User> findAll(Pageable pageable);
	
	public User save(User user);
	
	public void delete(Long Id);
}

package com.sprinboot20.app.services.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sprinboot20.app.entities.User;
import com.sprinboot20.app.json.UserRest;
import com.sprinboot20.app.repository.UserRepository;
import com.sprinboot20.app.services.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	private static final ModelMapper modelmapper = new ModelMapper();

	@Override
	public UserRest findUserByName(String name) {
		return modelmapper.map(getUserByName(name), UserRest.class);
	}

	@Override
	public UserRest findUserById(Long id) {
		return modelmapper.map(getUserByID(id), UserRest.class);
	}

	@Override
	public List<UserRest> findAllUser() {
		final List<User> users = new LinkedList<>(); 
		users.addAll(userRepository.findAllUser().orElseThrow());		
		return null;
	}

	@Override
	public Boolean deleteUserById(String name) {
		return null;
	}

	@Override
	public UserRest updateUserById(String name) {
		return null;
	}

	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Long Id) {
		userRepository.deleteById(Id);
	}
	
	private User getUserByID(Long id) {
		return userRepository.findById(id).orElseThrow();
	}
	
	private User getUserByName(String name) {
		return userRepository.findByName(name).orElseThrow();
	}
}

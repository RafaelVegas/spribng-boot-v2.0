package com.sprinboot20.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sprinboot20.app.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findById(Long id);
	
	Optional<User> findByName(String name);
	
	@Query("SELECT USE FROM USERS USE")
	Optional<List<User>> findAllUser();
	
	Optional<Boolean> deleteByName(String name);
}

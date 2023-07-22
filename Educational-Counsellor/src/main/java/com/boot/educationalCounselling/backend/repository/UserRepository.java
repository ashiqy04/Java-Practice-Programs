package com.boot.educationalCounselling.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.educationalCounselling.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);

	Boolean existsByEmail(String email);
	
	//Optional<User> findByEmailAndPassword(String email, String Password);

	//Boolean existsByPassword(String password);

	//Boolean existsByEmailAndPassword(String email, boolean b);
}

package com.boot.educationalCounselling.backend.service;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.boot.educationalCounselling.backend.dto.LoginDto;
import com.boot.educationalCounselling.backend.dto.RegisterDto;
import com.boot.educationalCounselling.backend.dto.ResetPasswordDto;
import com.boot.educationalCounselling.backend.entity.Role;
import com.boot.educationalCounselling.backend.entity.User;
import com.boot.educationalCounselling.backend.repository.RoleRepository;
import com.boot.educationalCounselling.backend.repository.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {

	private AuthenticationManager authenticationManager;
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private PasswordEncoder passwordEncoder;

	@Autowired
	public AuthServiceImpl(AuthenticationManager authenticationManager, UserRepository userRepository,
			RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
		this.authenticationManager = authenticationManager;
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public String register(RegisterDto registerDto) {

		// checks if email exists in database
		if (userRepository.existsByEmail(registerDto.getEmail())) {
			return "Email id already exists";
		}

		User user = new User();
		user.setFirstName(registerDto.getFirstName());
		user.setLastName(registerDto.getLastName());
		user.setEmail(registerDto.getEmail());
		user.setPassword(passwordEncoder.encode(registerDto.getPassword()));

		Set<Role> roles = new HashSet<>();
		Role userRole = roleRepository.findByRoleType("ROLE_USER").get();
		roles.add(userRole);
		user.setRoles(roles);

		userRepository.save(user);

		return "User registered successfully";

	}

	@Override
	public String login(LoginDto loginDto) {
		if (userRepository.existsByEmail(loginDto.getEmail())) {

			Authentication authentication = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword()));
			SecurityContextHolder.getContext().setAuthentication(authentication);

			return "User Logged-in successfully";
		}

		return "INVALID EMAIL ID" + "\nNO USER FOUND with the entered email id." + "\nPlease Sign Up first";
	}

	
	@Override
	public String resetPassword(ResetPasswordDto resetPasswordDto) {
		if (userRepository.existsByEmail(resetPasswordDto.getEmail())) {
			User existingUser = userRepository.findByEmail(resetPasswordDto.getEmail()).get();
			existingUser.setPassword(passwordEncoder.encode(resetPasswordDto.getPassword()));
			userRepository.save(existingUser);
			return "PASSWORD RESET SUCCESSFUL";
		}

		return "PASSWORD RESET FAILED!" + "\nNo such user found with entered email id."
				+ "\nPlease Try Again with registered email id.";
	}
}

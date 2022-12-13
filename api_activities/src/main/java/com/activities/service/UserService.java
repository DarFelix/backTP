package com.activities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activities.domain.User;
import com.activities.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> listUsers() {
		return userRepository.listUsers();
	}

	public void createUser(User user) {
		userRepository.createUser(user.getName(), user.getNumberDoc(), user.getCity().name(), user.getGenre().name(),
				user.getBirthday(), user.getEmployee().getIdEmployee());

	}
	
	public User findUserByIdEmploy(int idEmployee)  throws Exception {
		
		User user = userRepository.findUserByIdEmploy(idEmployee).orElse(null);
		
		return user;
		
	}
	
	public void deletePreInscriptUser(int idUser) {
		userRepository.deletePreInscriptUser(idUser);
	}

}

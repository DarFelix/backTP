package com.activities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activities.domain.User;
import com.activities.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
    public ResponseEntity<List<User>> listUser(){
        List<User> list = userService.listUsers();
        return new ResponseEntity<List<User>>(list, HttpStatus.OK);
    }
	
	@GetMapping("/{idUser}")
	public ResponseEntity<User> findUser(@PathVariable int idUser) {
		User user = userService.findUser(idUser);
		 return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<Object>("usuario guardado", HttpStatus.CREATED);
    }
	
}

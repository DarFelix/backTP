package com.activities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activities.domain.User;
import com.activities.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
    public ResponseEntity<List<User>> listUser(){
        List<User> list = userService.listUsers();
        return new ResponseEntity<List<User>>(list, HttpStatus.OK);
    }
	
	@PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<Object>("usuario guardado", HttpStatus.CREATED);
    }
	
	@GetMapping("/{idEmployee}")
	public ResponseEntity<?> findUserByIdEmploy(@PathVariable int idEmployee) throws Exception {
		try {
			User user = userService.findUserByIdEmploy(idEmployee);
			if(user != null) {
			return new ResponseEntity<User>(user, HttpStatus.OK);
			}else {
			return new ResponseEntity<Object>(user, HttpStatus.NO_CONTENT);	
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	@DeleteMapping("/{idUser}")
    void deletePreInscriptUser(@PathVariable int idUser){
        userService.deletePreInscriptUser(idUser);
    }
	
}

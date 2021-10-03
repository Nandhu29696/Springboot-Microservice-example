package com.example.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import com.example.demo.ValueObject.ResponseTemplateVO;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@PostMapping("/add")
	public User saveUser(@RequestBody User user) {
		log.info("user saved using controller");
		return userService.saveUser(user);
	}

	@GetMapping("getuserwithDepartment/{userId}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable String userId) {
		log.info("user will get deaprtment by userId");
		return userService.getUserWithDepartment(userId);
	}
}

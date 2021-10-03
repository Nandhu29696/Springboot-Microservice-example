package com.example.demo.Dao;

import com.example.demo.Model.User;

public interface UserDao {

	User saveUser(User user);

	User findbyUserid(String userId);

}

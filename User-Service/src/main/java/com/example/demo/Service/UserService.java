package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.ValueObject.ResponseTemplateVO;

public interface UserService {

	User saveUser(User user);

	ResponseTemplateVO getUserWithDepartment(String userId);

}

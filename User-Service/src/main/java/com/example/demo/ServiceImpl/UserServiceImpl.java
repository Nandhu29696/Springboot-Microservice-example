package com.example.demo.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Dao.UserDao;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import com.example.demo.ValueObject.Department;
import com.example.demo.ValueObject.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RestTemplate restTemplate;

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User saveUser(User user) {
		log.info("user saved using uservice");
		return userDao.saveUser(user);
	}

	@Override
	public ResponseTemplateVO getUserWithDepartment(String userId) {
		
		ResponseTemplateVO vo =new ResponseTemplateVO();
		
		User user = userDao.findbyUserid(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/finddepartment/"+user.getDepartmentId(), Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

}

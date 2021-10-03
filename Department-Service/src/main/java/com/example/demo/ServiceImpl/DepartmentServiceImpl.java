package com.example.demo.ServiceImpl;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.DepartmentDao;
import com.example.demo.Model.Department;
import com.example.demo.Service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	private static final Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentServiceImpl.class);

	@Override
	public Department saveDepartment(Department department) {
		log.info("Department save using service");
		return departmentDao.saveUser(department);
	}

	@Override
	public Department findyByDepartmentId(String id) {
		log.info("find department by ID using service");

		return departmentDao.findByDepartmentId(id);
	}

}

package com.example.demo.Dao;

import com.example.demo.Model.Department;

public interface DepartmentDao {

	Department saveUser(Department department);

	Department findByDepartmentId(String id);
}

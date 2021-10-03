package com.example.demo.Service;

import com.example.demo.Model.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	Department findyByDepartmentId(String id);

}

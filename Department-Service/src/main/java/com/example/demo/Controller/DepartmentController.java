package com.example.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Department;
import com.example.demo.Service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@CrossOrigin
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);

	@PostMapping("/add")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Department save using controller");
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/finddepartment/{id}")
	public Department findDepartmentbyId(@PathVariable String id) {
		log.info("find department by id using controller");
		return departmentService.findyByDepartmentId(id);
	}
}

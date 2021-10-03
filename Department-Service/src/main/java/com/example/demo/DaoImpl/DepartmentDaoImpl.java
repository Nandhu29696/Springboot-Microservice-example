package com.example.demo.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Dao.DepartmentDao;
import com.example.demo.Model.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public Department saveUser(Department department) {
		Department data = null;

		try {
			data = mongoTemplate.insert(department);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public Department findByDepartmentId(String id) {
		Department data = null;
		try {
			Query query = new Query();
			query.addCriteria(Criteria.where("_id").is(id));
			data = mongoTemplate.findOne(query, Department.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}

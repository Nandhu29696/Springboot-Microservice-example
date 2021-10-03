package com.example.demo.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Dao.UserDao;
import com.example.demo.Model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public User saveUser(User user) {
		User data = null;
		try {
			data = mongoTemplate.insert(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public User findbyUserid(String userId) {
		User data = null;
		try {
			Query query = new Query();
			query.addCriteria(Criteria.where("_id").is(userId));
			data = mongoTemplate.findOne(query, User.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}

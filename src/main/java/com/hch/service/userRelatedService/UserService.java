package com.hch.service.userRelatedService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hch.dao.userRelatedDao.UserDao;
import com.hch.entity.userRelatedEntity.User;
import com.hch.service.baseService.BaseService;

@Service
public class UserService extends BaseService<User, UserDao> {

	@Autowired
	public UserDao userDao;

	/*
	 * 通过用户名查询用户
	 */
	public User findByName(String name) {
		return userDao.findByName(name);
	}

	/*
	 * 通过Id查询用户
	 */
	public User get(String id) {
		return super.get(id);
	}

	/*
	 * 通过email查询用户
	 */
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	/*
	 * 插入单条数据
	 */
	public void insert(User user) {
		user.preInsert();
		userDao.insert(user);
	}
}

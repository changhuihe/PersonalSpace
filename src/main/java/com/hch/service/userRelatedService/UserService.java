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
	 * ͨ���û�����ѯ�û�
	 */
	public User findByName(String name) {
		return userDao.findByName(name);
	}

	/*
	 * ͨ��Id��ѯ�û�
	 */
	public User get(String id) {
		return super.get(id);
	}

	/*
	 * ͨ��email��ѯ�û�
	 */
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	/*
	 * ���뵥������
	 */
	public void insert(User user) {
		user.preInsert();
		userDao.insert(user);
	}
}

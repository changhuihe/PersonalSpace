package com.hch.dao.userRelatedDao;

import com.hch.dao.baseDao.BaseDao;
import com.hch.entity.userRelatedEntity.User;

public interface UserDao extends BaseDao<User> {

	/*
	 * 通过用户名查询用户
	 */
	public User findByName(String name);

	/*
	 * 通过email查询用户
	 */
	public User findByEmail(String email);

}

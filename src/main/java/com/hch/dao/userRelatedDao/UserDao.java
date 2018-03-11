package com.hch.dao.userRelatedDao;

import com.hch.dao.baseDao.BaseDao;
import com.hch.entity.userRelatedEntity.User;

public interface UserDao extends BaseDao<User> {

	/*
	 * ͨ���û�����ѯ�û�
	 */
	public User findByName(String name);

	/*
	 * ͨ��email��ѯ�û�
	 */
	public User findByEmail(String email);

}

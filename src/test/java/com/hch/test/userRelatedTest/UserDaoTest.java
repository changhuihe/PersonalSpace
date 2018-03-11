package com.hch.test.userRelatedTest;

import org.junit.Test;

import com.hch.dao.userRelatedDao.UserDao;
import com.hch.entity.userRelatedEntity.User;
import com.hch.service.userRelatedService.UserService;
import com.hch.test.baseTest.BaseTest;

public class UserDaoTest extends BaseTest {

	@Test
	public void findByName() {
		UserDao userDao = ac.getBean("userDao", UserDao.class);
		User user = userDao.findByName("hch");
		System.out.println(user);

		UserService userService = ac.getBean("userService", UserService.class);
		user = userService.findByName("hch");
		System.out.println(user);

		user = userService.get("9bdabe60-2444-11e8-8fda-208984e4020a");
		System.out.println(user);
	}
}

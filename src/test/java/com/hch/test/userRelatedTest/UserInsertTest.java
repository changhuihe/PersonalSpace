package com.hch.test.userRelatedTest;

import org.junit.Test;

import com.hch.entity.userRelatedEntity.User;
import com.hch.service.userRelatedService.UserService;
import com.hch.test.baseTest.BaseTest;

public class UserInsertTest extends BaseTest {
	@Test
	public void findByName() {
		UserService userService = ac.getBean("userService", UserService.class);
		User user = new User();
		user.setName("dddd");
		user.setPassword("222");
		System.out.println(user);
		userService.insert(user);

	}
}

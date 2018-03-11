package com.hch.test.datasourceConnectTest;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApacheTest {

	// 需要解开配置文件中的注释
	@Test
	public void ApacheConnectTest() throws SQLException {
		ApplicationContext ac = (ApplicationContext) new ClassPathXmlApplicationContext(
				"spring/spring-context.xml");
		BasicDataSource ds = ac.getBean("dataSource", BasicDataSource.class);
		System.out.println(ds);
		System.out.println(ds.getPassword());
		System.out.println(ds.getUsername());
		System.out.println(ds.getClass());
		System.out.println(ds.getConnection());
	}
}

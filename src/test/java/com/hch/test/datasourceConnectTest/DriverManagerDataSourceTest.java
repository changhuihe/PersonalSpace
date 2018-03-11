package com.hch.test.datasourceConnectTest;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DriverManagerDataSourceTest {

	//需要解开配置文件中的注释
	@Test
	public void DriverManagerDataSourcetest() throws SQLException {
		ApplicationContext ac = (ApplicationContext) new ClassPathXmlApplicationContext(
				"spring/spring-context.xml");
		DriverManagerDataSource ds = ac
				.getBean("dataSource", DriverManagerDataSource.class);
		System.out.println(ds);
		System.out.println(ds.getPassword());
		System.out.println(ds.getUsername());
		System.out.println(ds.getClass());
		System.out.println(ds.getConnection());
	}
}

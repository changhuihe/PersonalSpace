package com.hch.test.datasourceConnectTest;

import java.sql.SQLException;

import org.junit.Test;

import com.hch.test.baseTest.BaseTest;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Test extends BaseTest {
	@Test
	public void c3p0ConnectTest() throws SQLException {
		ComboPooledDataSource ds = ac.getBean("dataSource", ComboPooledDataSource.class);
		System.out.println(ds);
		System.out.println(ds.getPassword());
		System.out.println(ds.getUser());
		System.out.println(ds.getDriverClass());
		System.out.println(ds.getConnection());
	}
}

package com.hch.entity.userRelatedEntity;

import java.util.Date;

import com.hch.entity.dataEntity.DataEntity;

public class User extends DataEntity<User> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 用户名
	 */
	private String name;
	/*
	 * 密码
	 */
	private String password;
	/*
	 * 出生日期，生日和年龄根据出生日期推导
	 */
	private Date birthDate;
	/*
	 * 邮箱
	 */
	private String email;
	/*
	 * 住址
	 */
	private String address;
	/*
	 * 联系方式
	 */
	private String contactWay;
	/*
	 * 是否可以登录,false不可以，true可以，默认true
	 */
	private Boolean loginFlag;
	/*
	 * 登录错误次数，错误3次，锁定用户不能登录，默认0
	 */
	private Integer errorCount;

	public User() {
		super();
		this.loginFlag = true;
		this.errorCount = 0;
	}

	public String getContactWay() {
		return contactWay;
	}

	public void setContactWay(String contactWay) {
		this.contactWay = contactWay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(Boolean loginFlag) {
		this.loginFlag = loginFlag;
	}

	public Integer getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", birthDate=" + birthDate + ", email=" + email
				+ ", address=" + address + ", contactWay=" + contactWay + ", loginFlag=" + loginFlag + ", errorCount="
				+ errorCount + "," + super.toString() + "]";
	}

}

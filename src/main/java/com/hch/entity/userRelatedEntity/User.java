package com.hch.entity.userRelatedEntity;

import java.util.Date;

import com.hch.entity.dataEntity.DataEntity;

public class User extends DataEntity<User> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * �û���
	 */
	private String name;
	/*
	 * ����
	 */
	private String password;
	/*
	 * �������ڣ����պ�������ݳ��������Ƶ�
	 */
	private Date birthDate;
	/*
	 * ����
	 */
	private String email;
	/*
	 * סַ
	 */
	private String address;
	/*
	 * ��ϵ��ʽ
	 */
	private String contactWay;
	/*
	 * �Ƿ���Ե�¼,false�����ԣ�true���ԣ�Ĭ��true
	 */
	private Boolean loginFlag;
	/*
	 * ��¼�������������3�Σ������û����ܵ�¼��Ĭ��0
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

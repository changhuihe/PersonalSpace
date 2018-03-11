package com.hch.entity.userRelatedEntity;

import com.hch.entity.dataEntity.DataEntity;

public class LogonRecord extends DataEntity<LogonRecord> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * ��¼IP
	 */
	private String ip;
	/*
	 * ��¼��ַ
	 */
	private String address;
	/*
	 * ��¼��Id
	 */
	private String loginerId;
	/*
	 * "��ס��"��־
	 */
	private String rememberFlag;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLoginerId() {
		return loginerId;
	}

	public void setLoginerId(String loginerId) {
		this.loginerId = loginerId;
	}

	public String getRememberFlag() {
		return rememberFlag;
	}

	public void setRememberFlag(String rememberFlag) {
		this.rememberFlag = rememberFlag;
	}

}

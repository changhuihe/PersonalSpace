package com.hch.entity.userRelatedEntity;

import com.hch.entity.dataEntity.DataEntity;

public class LogonRecord extends DataEntity<LogonRecord> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 登录IP
	 */
	private String ip;
	/*
	 * 登录地址
	 */
	private String address;
	/*
	 * 登录者Id
	 */
	private String loginerId;
	/*
	 * "记住我"标志
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

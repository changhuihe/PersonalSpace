package com.hch.sys;

import java.util.List;

/*
 * Ajax请求返回信息类
 */
public class AjaxMessage<E> {
	/*
	 * 请求处理结果标志：true处理成功，false处理失败
	 */
	public Boolean flag;

	/*
	 * 处理结果说明
	 */
	public String message;

	/*
	 * 返回信息
	 */
	public List<E> list;
	/*
	 * 返回单条信息
	 */
	public E e;

	public AjaxMessage() {
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "AjaxMessage [flag=" + flag + ", message=" + message + ", list=" + list + ", e=" + e + "]";
	}

	

}

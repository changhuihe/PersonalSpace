package com.hch.sys;

import java.util.List;

/*
 * Ajax���󷵻���Ϣ��
 */
public class AjaxMessage<E> {
	/*
	 * ����������־��true����ɹ���false����ʧ��
	 */
	public Boolean flag;

	/*
	 * ������˵��
	 */
	public String message;

	/*
	 * ������Ϣ
	 */
	public List<E> list;
	/*
	 * ���ص�����Ϣ
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

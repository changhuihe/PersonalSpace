package com.hch.entity.dataEntity;

import com.hch.entity.baseEntity.BaseEntity;
import com.hch.entity.userRelatedEntity.User;

/*
 * ���ݳ���ʵ����
 */
public abstract class DataEntity<T> extends BaseEntity<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * ������
	 */
	private User creator;
	/*
	 * �޸���Id
	 */
	private User editor;
	/*
	 * ɾ����
	 */
	private User deleteUser;
	/*
	 * �����
	 */
	private User checker;

	public DataEntity() {
		super();
	}

	/*
	 * ��������ǰʵ�ֵķ���
	 */
	@Override
	public void preInsert() {

	}

	/*
	 * ��������ǰʵ�ֵķ���
	 */
	@Override
	public void preUpdate() {

	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public User getEditor() {
		return editor;
	}

	public void setEditor(User editor) {
		this.editor = editor;
	}

	public User getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteUser(User deleteUser) {
		this.deleteUser = deleteUser;
	}

	public User getChecker() {
		return checker;
	}

	public void setChecker(User checker) {
		this.checker = checker;
	}

	@Override
	public String toString() {
		return "creator=" + creator + ", editor=" + editor + ", deleteUser=" + deleteUser + ", checker=" + checker + ", "
				+ super.toString();
	}

}

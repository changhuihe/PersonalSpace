package com.hch.entity.dataEntity;

import com.hch.entity.baseEntity.BaseEntity;
import com.hch.entity.userRelatedEntity.User;

/*
 * 数据抽象实体类
 */
public abstract class DataEntity<T> extends BaseEntity<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 创建人
	 */
	private User creator;
	/*
	 * 修改人Id
	 */
	private User editor;
	/*
	 * 删除人
	 */
	private User deleteUser;
	/*
	 * 审核人
	 */
	private User checker;

	public DataEntity() {
		super();
	}

	/*
	 * 插入数据前实现的方法
	 */
	@Override
	public void preInsert() {

	}

	/*
	 * 更新数据前实现的方法
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

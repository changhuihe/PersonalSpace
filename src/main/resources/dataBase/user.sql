DROP TABLE IF EXISTS ps_user;

CREATE TABLE IF NOT EXISTS ps_user (
	id VARCHAR (40) NOT NULL PRIMARY KEY COMMENT 'id',
	NAME VARCHAR (20) NOT NULL COMMENT '�û���',
	PASSWORD VARCHAR (32) NOT NULL COMMENT '����',
	birth_date date COMMENT '��������',
	email VARCHAR (40) COMMENT '����',
	address VARCHAR (100) COMMENT '��ַ',
	contact_way VARCHAR (20) COMMENT '��ϵ��ʽ',
	login_flag TINYINT(1)  NOT NULL DEFAULT 1 COMMENT '�Ƿ���Ե�¼ 1�����ԣ�0��������',
	error_count INT NOT NULL DEFAULT 0 COMMENT '��¼�������',
	deleted_flag INT NOT NULL DEFAULT 0 COMMENT 'ɾ����־��0��δɾ����1��ɾ����2������ɾ��',
	checked_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT '��˱�־��1����ˣ�0��δ���',
	create_date date COMMENT '��������',
	creator_id VARCHAR (40) COMMENT '������Id',
	editor_date date COMMENT '�޸�����',
	editor_id VARCHAR (40) COMMENT '�޸���Id',
	delete_date date COMMENT 'ɾ������',
	delete_userId VARCHAR (40) COMMENT 'ɾ����Id',
	check_date date COMMENT '�������',
	checker_id VARCHAR (40) COMMENT '�����Id'
) COMMENT '�û���' ENGINE = INNODB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;


insert into ps_user values(uuid(),'hch','202cb962ac59075b964b07152d234b70',null,null,null,null,1,0,0,1,null,null,null,null,null,null,null,null);
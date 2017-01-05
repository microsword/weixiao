package com.wx.getdata.entity;

import java.util.Date;

public class BaseEntity {

	private Long id;
	 
	private Integer status;

	private Date created_at;

	private Date updated_at;

	private Integer created_user;

	private Integer updated_user;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Integer getCreated_user() {
		return created_user;
	}

	public void setCreated_user(Integer created_user) {
		this.created_user = created_user;
	}

	public Integer getUpdated_user() {
		return updated_user;
	}

	public void setUpdated_user(Integer updated_user) {
		this.updated_user = updated_user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

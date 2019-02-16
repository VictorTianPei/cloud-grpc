package com.test.config;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
public abstract class BaseEntity implements Serializable  {

	private static final long serialVersionUID = -7674269980281525370L;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date CreateDate;

	@Version
	private Integer version;

	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}

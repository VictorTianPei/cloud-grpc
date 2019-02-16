package com.test.domain;

import com.test.config.BaseEntity;
import com.test.config.Encryption;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sys_user database table.
 * 
 */
@Entity
//@Table(name="sys_user")
//@NamedQuery(name="SysUser.findAll", query="SELECT s FROM SysUser s")
public class SysUser extends BaseEntity{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;


	private String nickname;

	@Encryption
	private String password;

	private Byte status;

	@Column(name="user_name")
	private String userName;

	public SysUser() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public SysUser(String userName, String password) {
		this.password = password;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "SysUser{" +
				"id=" + id +
				", createDate=" + getCreateDate() +
				", nickname='" + nickname + '\'' +
				", password='" + password + '\'' +
				", status=" + status +
				", userName='" + userName + '\'' +
				'}';
	}
}
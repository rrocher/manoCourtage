package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;


/**
 * The persistent class for the user_work database table.
 * 
 */
@Entity
@Table(name="user_work")
@NamedQuery(name="UserWork.findAll", query="SELECT u FROM UserWork u")
public class UserWork extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String comments;

	private String company;

	@Column(name="address")
	private String address;

	@Column(name="phone")
	private String phone;

	@Column(name="position")
	private String position;

	@Column(name="supervisor")
	private String supervisor;

	@Column(name="supervisor_phone")
	private String supervisorPhone;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user")
	@JsonIgnore
	private User user;

	public UserWork() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public String getSupervisorPhone() {
		return supervisorPhone;
	}

	public void setSupervisorPhone(String supervisorPhone) {
		this.supervisorPhone = supervisorPhone;
	}
	

}
package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * The persistent class for the privilege database table.
 * 
 */
@Entity
@Table(name="privilege")
@NamedQuery(name="Privilege.findAll", query="SELECT p FROM Privilege p")
public class Privilege extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	private String comments;

	private String name;

	@JsonIgnore
	@ManyToMany(mappedBy = "privileges")
	private Set<Role> roles;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "privileges")
	private Set<User> users;
	
	public Privilege() {
		roles = new HashSet<>();
		users = new HashSet<>();
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		if (getUsers().contains(user))
			return user;
		getUsers().add(user);
		user.addPrivilege(this);
		return user;
	}
	
	public User removeUser(User user) {
		if (!getUsers().contains(user))
			return user;
		getUsers().remove(user);
		user.removePrivilege(this);

		return user;
	}

	public Role addRole(Role role) {

		if (getRoles().contains(role))
			return role;
		getRoles().add(role);
		role.addPrivilege(this);
		return role;
	}
	
	public Role removeRole(Role role) {
		if (!getRoles().contains(role))
			return role;
		getRoles().remove(role);
		role.removePrivilege(this);

		return role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Privilege other = (Privilege) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
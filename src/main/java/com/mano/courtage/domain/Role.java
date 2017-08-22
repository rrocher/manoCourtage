package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@Table(name="role")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role extends AbstractEntity implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Enumerated(EnumType.STRING)
	private ROLE code;

	private String comments;

	private String name;

	@JsonIgnore
	@ManyToMany
	(mappedBy = "roles")
    private Set<User> users;

    @ManyToMany
    @JoinTable(name = "role_privilege", 
    joinColumns = @JoinColumn(name = "role", referencedColumnName = "id"), 
    inverseJoinColumns = @JoinColumn(name = "privilege", referencedColumnName = "id"))
    private Set<Privilege> privileges;
    
	public Role() {
		privileges = new HashSet<>();
		users = new HashSet<>();
	}


	public ROLE getCode() {
		return this.code;
	}

	public void setCode(ROLE code) {
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
	
	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
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
		user.addRole(this);
		return user;
	}
	
	public User removeUser(User user) {
		if (!getUsers().contains(user))
			return user;
		getUsers().remove(user);
		user.removeRole(this);

		return user;
	}

	public Privilege addPrivilege(Privilege priv) {
		if (getPrivileges().contains(priv))
			return priv;
		getPrivileges().add(priv);
		priv.addRole(this);
		return priv;
	}
	
	public Privilege removePrivilege(Privilege priv) {
		if (!getPrivileges().contains(priv))
			return priv;
		getPrivileges().remove(priv);
		priv.removeRole(this);

		return priv;
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
		Role other = (Role) obj;
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
package com.mano.courtage.domain;

import java.io.Serializable;
import javax.persistence.*;


import jersey.repackaged.com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name = "user")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String address;

	private String city;

	private String email;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String password;

	@Column(name = "personnal_phone")
	private String personnalPhone;

	private String province;

	// bi-directional many-to-one association to UserWork
	@OneToMany(mappedBy = "user")
	private List<UserWork> userWorks;

	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "role", referencedColumnName = "id"))
	private Set<Role> roles;

	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name = "user_privilege", 
	joinColumns = @JoinColumn(name = "user", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "privilege", referencedColumnName = "id"))
	private Set<Privilege> privileges;
	
	private boolean enabled;

	public User() {
		userWorks = Lists.newArrayList();
		roles = new HashSet<>();
		privileges = new HashSet<>();
	}

	public void addUserWork(UserWork userWork) {
		userWorks.add(userWork);
	}
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPersonnalPhone() {
		return this.personnalPhone;
	}

	public void setPersonnalPhone(String personnalPhone) {
		this.personnalPhone = personnalPhone;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public List<UserWork> getUserWorks() {
		return userWorks;
	}

	public void setUserWorks(List<UserWork> userWorks) {
		this.userWorks = userWorks;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public Role addRole(Role role) {
		if (getRoles().contains(role))
			return role;
		getRoles().add(role);
		role.addUser(this);
		return role;
	}
	
	public Role removeRole(Role role) {
		if (!getRoles().contains(role))
			return role;
		getRoles().remove(role);
		role.removeUser(this);

		return role;
	}
	
	public Privilege addPrivilege(Privilege priv) {

		if (getPrivileges().contains(priv))
			return priv;
		getPrivileges().add(priv);
		priv.addUser(this);
		return priv;
	}
	
	public Privilege removePrivilege(Privilege priv) {

		if (!getPrivileges().contains(priv))
			return priv;
		getPrivileges().remove(priv);
		priv.removeUser(this);

		return priv;
	}
	
	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [address=" + address + ", city=" + city + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", password=" + password + ", personnalPhone=" + personnalPhone
				+ ", province=" + province + ", userWorks=" + userWorks + ", roles=" + roles + ", privileges="
				+ privileges + "]";
	}

}
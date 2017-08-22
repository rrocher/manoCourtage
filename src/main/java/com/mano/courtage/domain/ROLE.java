package com.mano.courtage.domain;

public enum ROLE {
	ROLE_ADMIN("ROLE_ADMIN"), ROLE_USER("ROLE_USER"), ROLE_SUPER_USER("ROLE_SUPER_USER");

	private final String name;

	private ROLE(String s) {
		name = s;
	}

	public boolean equalsName(String otherName) {
		// (otherName == null) check is not needed because name.equals(null) returns
		// false
		return name.equals(otherName);
	}

	public String toString() {
		return this.name;
	}
}

package com.mano.courtage.domain;

public enum STATE {
	REVIEW_PENDING("REVIEW_PENDING"), 
	REVIEW_IN_PROGRESS("REVIEW_IN_PROGRESS"), 
	REVIEW_ON_STANDBY("REVIEW_ON_STANDBY"), 
	REVIEW_ON_WAIT("REVIEW_ON_WAIT"), 
	APPROVED("APPROVED"),
	REJECTED("REJECTED");

	private final String name;

	private STATE(String s) {
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
